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
public class BT1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Cac so chia het cho 7 va khong la boi so cua 5 "
                + "la: ");
        for (int i = 10; i < 201; i++) {
            if (i % 7 == 0 && i % 5 != 0) {
                System.out.println(i);
            }
        }
    }
}
