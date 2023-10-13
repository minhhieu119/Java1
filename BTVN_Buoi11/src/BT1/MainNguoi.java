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
public class MainNguoi {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Nguoi> nG = new ArrayList<>();
        System.out.println("Nhap ten: ");
        String name = sc.nextLine();
        System.out.println("Nhap tuoi: ");
        int age = Integer.valueOf(sc.nextLine());
        System.out.println("Nhap dia chi: ");
        String address = sc.nextLine();

        Nguoi ng = new Nguoi(name, age, address);
        nG.add(ng);
        System.out.println("-----------");
        for (Nguoi n : nG) {
            n.printInfo();
        }
    }
}
