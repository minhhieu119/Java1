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
public class MainThucVat {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ma thuc vat: ");
        String id = sc.nextLine();
        System.out.println("Nhap ten: ");
        String name = sc.nextLine();
        System.out.println("Nhap tuoi: ");
        int age = Integer.valueOf(sc.nextLine());
        System.out.println("Nhap chieu cao: ");
        double height = Double.valueOf(sc.nextLine());
        System.out.println("Nhap khu vuc song: ");
        String habitat = sc.nextLine();

        ThucVat tv = new ThucVat(id, name, age, height, habitat);
        System.out.println("---------------");
        tv.display();
    }
}
