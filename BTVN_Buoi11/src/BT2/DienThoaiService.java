/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BT2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author MSII
 */
public class DienThoaiService {

    Scanner sc = new Scanner(System.in);
    ArrayList<DienThoai> listDT = new ArrayList<>();

    public void nhapTT() {

        while (true) {
            System.out.println("Nhap ma: ");
            int id = Integer.valueOf(sc.nextLine());
            System.out.println("Nhap ten: ");
            String name = sc.nextLine();
            System.out.println("Nhap hang: ");
            String manufacturer = sc.nextLine();
            System.out.println("Nhap mau: ");
            String color = sc.nextLine();
            System.out.println("Nhap bo nho: ");
            int memory = Integer.valueOf(sc.nextLine());
            System.out.println("Nhap gia tien: ");
            int cost = Integer.valueOf(sc.nextLine());
            DienThoai dt = new DienThoai(id, name, manufacturer, color, memory, cost);
            listDT.add(dt);
            System.out.println("Ban co muon nhap tiep khong(1-Co, 0-Khong)");
            String tmp = sc.nextLine();
            if (tmp.equalsIgnoreCase("0")) {
                System.out.println("Nhap thanh cong");
                break;
            }
        }
    }

    public void inTT() {
        for (DienThoai dienThoai : listDT) {
            dienThoai.printInfo();
        }
    }
    
    public void timDienThoai(int gia) {
        for (DienThoai dienThoai : listDT) {
            if (dienThoai.getCost() == gia) {
                dienThoai.printInfo();
            }
        }
    }
    
    public void lietKeBoNho(int boNho){
        for (DienThoai dienThoai : listDT) {
            if(dienThoai.getMemory() == boNho){
                dienThoai.printInfo();
            }
        }
    }
    
    //Sap xep giam dan
    //Ten: string dung ham compareTo

    public void sapXepTheoTen() {
        listDT.sort((o1, o2) -> {
            return o2.getName().compareTo(o1.getName());
        });
    }

    public void sapXepTangDanTheoGia() {
        listDT.sort((o1, o2) -> {
            return o1.getCost() - o2.getCost();
        });

    }

    public void xoaTheoViTri(int viTri) {
        listDT.remove(viTri);
    }

    public void xoaDTTheoMa(int ma) {
        for (DienThoai dienThoai : listDT) {
            if (dienThoai.getId() == ma) {
                listDT.remove(dienThoai);
            }else{
                System.out.println("Khong co ma dien thoai nay");
            }
        }
    }
}
