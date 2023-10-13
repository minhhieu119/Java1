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
public class MainMayTinh {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<MayTinh> listMT = new ArrayList<>();
        System.out.println("Nhap ma may: ");
        String comID = sc.nextLine();
        System.out.println("Nhap ten may: ");
        String ten = sc.nextLine();
        System.out.println("Nhap dong may: ");
        String comType = sc.nextLine();
        System.out.println("Nhap gia may: ");
        float cost = Float.valueOf(sc.nextLine());

        MayTinh mt = new MayTinh(comID, ten, comType, cost);
        listMT.add(mt);
        listMT.forEach(a -> a.printInfo());
    }
}
