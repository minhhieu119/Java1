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
public class MainGiangVien {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ma: ");
        String id = sc.nextLine();
        System.out.println("Nhap ten: ");
        String name = sc.nextLine();
        System.out.println("Nhap dia chi: ");
        String address = sc.nextLine();
        System.out.println("Nhap can nang: ");
        float weight = Float.valueOf(sc.nextLine());
        System.out.println("Nhap chieu cao: ");
        double height = Double.valueOf(sc.nextLine());
        System.out.println("Nhap bac: ");
        int level = Integer.valueOf(sc.nextLine());
        GiangVien gv = new GiangVien(id, name, address, weight, height, level);
        System.out.println("-----------------");
        gv.printInfo();
    }
}
