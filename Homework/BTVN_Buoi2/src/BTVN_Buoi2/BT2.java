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
public class BT2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Moi nhap diem Toan: ");
        double mathScore = sc.nextDouble();
        System.out.println("Moi nhap diem Li: ");
        double physicsScore = sc.nextDouble();
        System.out.println("Moi nhap diem Hoa: ");
        double chemistryScore = sc.nextDouble();

        System.out.println("-----------");
        System.out.println("Diem Toan: " + mathScore);
        System.out.println("Diem Li: " + physicsScore);
        System.out.println("Diem Hoa: " + chemistryScore);
    }
}
