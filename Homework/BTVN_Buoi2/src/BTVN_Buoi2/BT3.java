/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BTVN_Buoi2;

import java.util.Scanner;

/**
 *
 * @author MSII
 */
public class BT3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ten cua ban: ");
        String name = sc.nextLine();
        System.out.println("Nhap nganh hoc cua ban: ");
        String major = sc.nextLine();
        System.out.println("Nhap dia chi cua ban: ");
        String address = sc.nextLine();
        System.out.println("Nhap que quan cua ban: ");
        String hometown = sc.nextLine();

        System.out.println("------------");
        System.out.println("Ten: " + name);
        System.out.println("Nganh hoc: " + major);
        System.out.println("Dia chi: " + address);
        System.out.println("Que quan: " + hometown);
    }
}
