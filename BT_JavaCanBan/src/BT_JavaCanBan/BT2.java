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
public class BT2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.valueOf(sc.nextLine());
        int factorial = 1;
        if (n == 0 || n == 1) {
            System.out.println(n + "! = 1");
        } else if (n > 0) {
            for (int i = 1; i < n + 1; i++) {
                factorial *= i;
            }
            System.out.println(n + "! = " + factorial);
        }
    }
}
