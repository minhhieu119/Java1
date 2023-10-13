/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BT1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author MSII
 */
public class MainThucVat {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<ThucVat> listTV = new ArrayList<>();
        System.out.println("Nhap Ma thuc vat: ");
        String planID = sc.nextLine();
        System.out.println("Nhap ten: ");
        String name = sc.nextLine();
        System.out.println("Nhap tuoi: ");
        int age = Integer.valueOf(sc.nextLine());
        System.out.println("Nhap chieu cao: ");
        double height = Double.valueOf(sc.nextLine());
        System.out.println("Nhap khu vuc song: ");
        String habitat = sc.nextLine();

        ThucVat tv = new ThucVat(planID, name, age, height, habitat);
        listTV.add(tv);
        System.out.println("---------------");
        for (ThucVat thucVat : listTV) {
            thucVat.printInfo();
        }
    }
}
