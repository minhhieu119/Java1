/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BT4;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author MSII
 */
public class QLDienThoai {
    Scanner sc = new Scanner(System.in);
    ArrayList<DienThoai>listDT = new ArrayList<>();
    
    public void nhapThongTin(){
        System.out.println("Nhap ten: ");
        String name = sc.nextLine();
        System.out.println("Nhap hang: ");
        String manu = sc.nextLine();
        System.out.println("Nhap mau: ");
        String color = sc.nextLine();
        System.out.println("Nhap bo nho: ");
        int memory = Integer.valueOf(sc.nextLine());
        System.out.println("Nhap gia: ");
        int cost = Integer.valueOf(sc.nextLine());
        
        DienThoai dt = new DienThoai(name, manu, color, memory, cost);
        listDT.add(dt);
    }
    
    public void inThongTin(){
        for (DienThoai dienThoai : listDT) {
            dienThoai.inTT();
            System.out.println("--------");
        }
    }
}
