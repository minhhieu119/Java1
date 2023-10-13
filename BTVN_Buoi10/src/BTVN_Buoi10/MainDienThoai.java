/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BTVN_Buoi10;

import java.util.Scanner;

/**
 *
 * @author MSII
 */
public class MainDienThoai {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ma: ");
        String id = sc.nextLine();
        System.out.println("Nhap ten: ");
        String name = sc.nextLine();
        System.out.println("Nhap dong may: ");
        String phoneType = sc.nextLine();
        System.out.println("Nhap gia: ");
        float cost = Float.valueOf(sc.nextLine());
        System.out.println("Nhap dung luong: ");
        int capacity = Integer.valueOf(sc.nextLine());
        System.out.println("Nhap mau sac: ");
        String color = sc.nextLine();
        DienThoai dt = new DienThoai(id, name, phoneType, cost, capacity, color);
        System.out.println("-------------------");
        dt.printInfo();
    }
}
