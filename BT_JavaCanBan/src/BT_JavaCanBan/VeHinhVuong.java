/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BT_JavaCanBan;

import java.util.Scanner;

/**
 *
 * @author MSII
 */
public class VeHinhVuong {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /**
         * Ve hinh vuong: - nhap vao 1 canh
         *
         */
//        int n = Integer.valueOf(sc.nextLine());
//        for (int i = 1; i < n+1; i++) {
//            for (int j = 1; j < n+1; j++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
        int n = Integer.valueOf(sc.nextLine());
        int m = Integer.valueOf(sc.nextLine());
        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < m + 1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
