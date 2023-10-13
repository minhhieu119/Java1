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
public class MainNguoi {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap Ten: ");
        String name = sc.nextLine();
        System.out.println("Nhap tuoi: ");
        int age = Integer.valueOf(sc.nextLine());
        System.out.println("Nhap dia chi: ");
        String address = sc.nextLine();

        Nguoi ng = new Nguoi(name, age, address);
        System.out.println("----------------");
        ng.printInformation();
        System.out.println("----------------");
    }
}
