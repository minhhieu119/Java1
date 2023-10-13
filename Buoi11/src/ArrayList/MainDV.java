/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author MSII
 */
public class MainDV {

    public static void main(String[] args) {
        ArrayList<DongVat> listDV = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ma dong vat: ");
        String animalID = sc.nextLine();
        System.out.println("Nhap ten dong vat: ");
        String name = sc.nextLine();
        System.out.println("Nhap can nang dong vat: ");
        double weight = Double.valueOf(sc.nextLine());
        DongVat dv1 = new DongVat(animalID, name, weight);
        listDV.add(dv1);
//        for (DongVat dongVat : listDV) {
//            dongVat.printInfo();
//        }
//        listDV.forEach(s -> s.printInfo());
        //C$: for each + medthod reference(::)
        listDV.forEach(DongVat::printInfo);
    }
}
