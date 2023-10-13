/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BTVN_Buoi5;

import java.util.Scanner;

/**
 *
 * @author MSII
 */
public class BTVNBuoi5_BT2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int menu;
        System.out.println("Moi nhap size n cua mang: ");
        int n = Integer.valueOf(sc.nextLine());
        System.out.println("-----------");
        int[] array = new int[n];

        System.out.println("Nhap cac phan tu cho mang: ");
        for (int i = 0; i < n; i++) {
            System.out.println("Phan tu vi tri " + i);
            array[i] = Integer.valueOf(sc.nextLine());
        }

        System.out.println("-----------");
        System.out.println("In cac phan tu cua mang: ");
        for (int i = 0; i < n; i++) {
            System.out.print(+array[i] + " ");
        }
        System.out.printf("\n-----------\n");

        int product = 1;
        for (int i = 0; i < n; i++) {
            if (i % 2 != 0) {
                product *= array[i];
            }
        }
        System.out.println("Tich cua cac phan tu ow vi tri le la: " + product);
        System.out.println("-----------");

        int count = 0;
        for (int i = 0; i < n; i++) {
            if (array[i] < 0) {
                ++count;
            }
        }
        System.out.println("Co " + count + " phan tu la so nguyen am "
                + "trong mang");
        System.out.println("-----------");

        int sum = 0;
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                if (array[i] % 3 == 0) {
                    sum += array[i];
                }
            }
        }
        System.out.println("Tong cac phan tu o vi tri chan chia het cho 3"
                + " la: " + sum);
    }
}
