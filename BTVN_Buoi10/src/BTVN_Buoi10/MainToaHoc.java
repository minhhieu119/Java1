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
public class MainToaHoc {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ma: ");
        String id = sc.nextLine();
        System.out.println("Nhap ten: ");
        String name = sc.nextLine();
        System.out.println("Nhap khu vuc: ");
        String habitat = sc.nextLine();
        ToaHoc th = new ToaHoc(id, name, habitat);
        System.out.println("-------------");
        th.printInfo();
    }
}
