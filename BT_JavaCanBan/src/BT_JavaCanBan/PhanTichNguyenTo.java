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
public class PhanTichNguyenTo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.valueOf(sc.nextLine());
        if (n < 2) {
            System.out.println("Day khong phai la so nguyen to");
        } else {
            for (int i = 2; i < n + 1; i++) {
                while (n % i == 0) {
                    System.out.println(i + " ");
                    n /= i;
                }
            }
        }
    }
}
