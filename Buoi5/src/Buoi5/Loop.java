/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Buoi5;

import java.util.Scanner;

/**
 *
 * @author MSII
 */
public class Loop {

    /**
     * Vong lap dung de lap lai 1 cong viec 1. While while(dkien){ //code } 2.
     * do...while do{ //code }while(dkien); for(gtri;dkien;buocnhay){ //code }
     * VD: 1. Nhap 1 so nguyen n. in ra cac so tu 0 - n 2. nhap 1 so nguyen tinh
     * tong tu 0- n 3. nhap 1 so nguyen tinh tich tu 1-n
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap n = ");
        int n = Integer.valueOf(sc.nextLine());
//        System.out.print("So cac so tu 0 - n: ");
//        for (int i = 0; i <= n; i++) {
//            System.out.print(" " + i);
//        }

//2.    
//        int sum = 0;
//        for (int i = 0; i < n + 1; i++) {
//            sum += i;
//        }
//        System.out.println("Tong cac so tu 0 - n: " + sum);
//3.
        int product = 1;
        for (int i = 1; i < n + 1; i++) {
            product *= i;
        }
        System.out.println("Tich cac so tu 1 - n: " + product);
    }
}
