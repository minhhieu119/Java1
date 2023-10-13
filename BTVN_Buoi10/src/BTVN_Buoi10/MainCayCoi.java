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
public class MainCayCoi {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ma: ");
        String id = sc.nextLine();
        System.out.println("Nhap ten: ");
        String name = sc.nextLine();
        System.out.println("Nhap khu vuc song: ");
        String habitat = sc.nextLine();
        System.out.println("Nhap gia: ");
        float cost = Float.valueOf(sc.nextLine());
        CayCoi cc = new CayCoi(id, name, habitat, cost);
        System.out.println("------------");
        cc.printInfo();
    }
}
