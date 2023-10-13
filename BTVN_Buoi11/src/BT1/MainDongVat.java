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
public class MainDongVat {

    public static void main(String[] args) {
        ArrayList<DongVat> listDV = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ma dong vat: ");
        String animalID = sc.nextLine();
        System.out.println("Nhap ten dong vat: ");
        String name = sc.nextLine();
        System.out.println("Nhap tuoi dong vat: ");
        int age = Integer.valueOf(sc.nextLine());
        System.out.println("Nhap can nang dong vat: ");
        double weight = Double.valueOf(sc.nextLine());

        DongVat dv = new DongVat(animalID, name, age, weight);
        listDV.add(dv);
        System.out.println("----------");
        for (DongVat dongVat : listDV) {
            dongVat.printInfo();
        }
    }
}
