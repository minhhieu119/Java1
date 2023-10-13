/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BT5_Buoi14;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author MSII
 */
public class DongHoService {
    Scanner sc = new Scanner(System.in);
    ArrayList<DongHo>listDH = new ArrayList<>();
    
    public void nhapThongTin(){
        while (true) {            
            System.out.println("Nhap ma: ");
            int id = Integer.valueOf(sc.nextLine());
            System.out.println("Nhap the loai: ");
            String type = sc.nextLine();
            System.out.println("Nhap mau sac: ");
            String color = sc.nextLine();
            System.out.println("Nhap kich thuoc: ");
            int width = Integer.valueOf(sc.nextLine());
            System.out.println("Nhap chat lieu: ");
            String material = sc.nextLine();
            System.out.println("Nhap gia: ");
            int cost = Integer.valueOf(sc.nextLine());
            DongHo dh = new DongHo(id, type, color, width, material, cost);
            listDH.add(dh);
            System.out.println("Ban co muon nhap tiep khong: Y-Co/ N-Khong");
            if(sc.nextLine().equalsIgnoreCase("n")){
                System.out.println("Ban nhap thanh cong");
                break;
            }
        }
    }
    
    public void inThongTin(){
        for (DongHo dongHo : listDH) {
            dongHo.inTT();
            System.out.println("----------");
        }
    }
    
    public void timTheoKhoangGia(int giaMin, int giaMax){
        for (DongHo dongHo : listDH) {
            if(dongHo.getCost() > giaMin && dongHo.getCost() < giaMax){
                dongHo.inTT();
            }
        }
    }
    
    public void xoaTheoMa(int ma){
        for (DongHo dongHo : listDH) {
            if(dongHo.getId() == ma){
                listDH.remove(dongHo);
            }
        }
    }
    
    public void sapXepTangDan(){
        listDH.sort((o1, o2) -> {
            return o1.getWidth() - o2.getWidth();
        });
    }
    
    public void sapXepGiam(){
        listDH.sort((o1, o2) -> {
            return o2.getWidth() - o1.getWidth();
        });
    }
}
