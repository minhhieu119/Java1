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
public class MainDongVat {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ma dong vat: ");
        String id = sc.nextLine();
        System.out.println("Ten: ");
        String name = sc.nextLine();
        System.out.println("Tuoi: ");
        int age = Integer.valueOf(sc.nextLine());
        System.out.println("Can nang: ");
        double weight = Double.valueOf(sc.nextLine());

        DongVat dv = new DongVat(id, name, age, weight);
        System.out.println("---------------");
        dv.printInformation();
    }
}
