/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BTThem_Buoi14;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author MSII
 */
public class QuanLiXeMayService {

    public void nhapThongtin(ArrayList<XeMay> listXM) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Nhap ma: ");
            String id = sc.nextLine();
            System.out.println("Nhap ten: ");
            String name = sc.nextLine();
            System.out.println("Nhap hang: ");
            String brand = sc.nextLine();
            System.out.println("Nhap gia: ");
            double cost = Double.valueOf(sc.nextLine());
            XeMay xm = new XeMay(id, name, brand, cost);
            listXM.add(xm);
            System.out.println("Ban co muon nhap tiep khong: Y-Co/ N-Khong");
            if(sc.nextLine().equalsIgnoreCase("n")){
                System.out.println("Ban nhap thanh cong");
                break;
            } 
        }
    }


    public void xuatThongTin(ArrayList<XeMay>listXM){
        for (XeMay xeMay : listXM) {
            xeMay.inThongTin();
        }
    }
    
    public void timKiemTheoGia(ArrayList<XeMay>listXM, int min, int max){
        for (XeMay xeMay : listXM) {
            if(xeMay.getCost() > min && xeMay.getCost()<max){
                xeMay.inThongTin();
            }
        }
    }
}
