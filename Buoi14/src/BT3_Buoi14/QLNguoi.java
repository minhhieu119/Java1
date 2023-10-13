/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BT3_Buoi14;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author MSII
 */
public class QLNguoi {
    Scanner sc = new Scanner(System.in);
    ArrayList<Nguoi>listNg = new ArrayList<>();
    
    public void nhapThongTin(){
        while (true) {            
            System.out.println("Nhap ten: ");
            String name = sc.nextLine();
            System.out.println("Nhap tuoi: ");
            int age = Integer.valueOf(sc.nextLine());
            System.out.println("Nhap gioi tinh(0-Nu;1-Nam): ");
            int gender = Integer.valueOf(sc.nextLine());
            System.out.println("Nhap que quan: ");
            String hometown = sc.nextLine();
            System.out.println("Nhap nghe nghiep: ");
            String job = sc.nextLine();
            
            Nguoi ng = new Nguoi(name, age, gender, hometown, job);
            listNg.add(ng);
            System.out.println("Ban co muon nhap tiep khong: Y-Co / N-Khong");
            if(sc.nextLine().equalsIgnoreCase("n")){
                System.out.println("Nhap thong tin thanh cong");
                break;
            }
        }
    }
    
    public void inThongTin(){
        for (Nguoi nguoi : listNg) {
            nguoi.inTT();
            System.out.println("----------");
        }
    }
}
