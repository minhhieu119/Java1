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
public class BT6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Moi nhap so: ");
        int n = sc.nextInt();
        int sum = (n +1) * n / 2;
        System.out.println("-----------");
        System.out.println("Tong tu 1 den n la: "+sum);
    }
}
