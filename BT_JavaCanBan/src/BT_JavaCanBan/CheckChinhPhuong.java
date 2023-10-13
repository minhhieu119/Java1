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
public class CheckChinhPhuong {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.valueOf(sc.nextLine());
        double squareRoot = Math.sqrt(n);
        if (n == (int) Math.pow(squareRoot, 2)) {
            System.out.println("Day la so chinh phuong");
        } else {
            System.out.println("Day khong la so chinh phuong");
        }
    }
}
