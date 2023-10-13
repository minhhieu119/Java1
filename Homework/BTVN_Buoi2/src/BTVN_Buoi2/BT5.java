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
public class BT5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Moi nhap so: ");
        int number = sc.nextInt();
        String ketQua = (number % 2 == 0)? "so chan" : "so le";
        System.out.println("So "+number+" la "+ketQua);
    }
}
