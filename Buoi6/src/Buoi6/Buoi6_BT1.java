/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Buoi6;

import java.util.Scanner;

/**
 *
 * @author MSII
 */
public class Buoi6_BT1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Moi nhap so luong phan tu: ");
        int n = Integer.valueOf(sc.nextLine());
        int arr[] = new int[n];

        System.out.println("-----------");
        System.out.println("Nhap gia tri cac phan tu trong mang: ");
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.valueOf(sc.nextLine());
        }
        System.out.println("-----------");
        System.out.println("In cac phan tu trong mang: ");
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
        System.out.println("-----------");

        int sum1 = 0;
        for (int i = 0; i < n; i++) {
            sum1 += arr[i];
        }
        System.out.println("Tong cac phan tu trong mang: " + sum1);
        System.out.println("-----------");

        int product = 1;
        for (int i = 0; i < n; i++) {
            product *= arr[i];
        }
        System.out.println("Tich cac phan tu trong mang: " + product);
        System.out.println("-----------");

        int count1 = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] % 3 == 0) {
                ++count1;
            }
        }
        System.out.println("Co " + count1 + " phan tu chia het cho 3");
        System.out.println("-----------");

        int count2 = 0;
        for (int i = 0; i < n; i++) {
            if (i % 2 != 0) {
                if (arr[i] % 5 == 0) {
                    ++count2;
                }
            }
        }
        System.out.println("Co " + count2 + " phan tu chia het cho 5 o vi tri "
                + "le");
        System.out.println("-----------");

        int sum2 = 0;
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                sum2 += arr[i];
            }
        }
        System.out.println("Tong cac phan tu o vi tri chan: " + sum2);
        System.out.println("-----------");

        int product2 = 1;
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                if (arr[i] % 2 == 0) {
                    product2 *= arr[i];
                }
            }
        }
        System.out.println("Tich cac phan tu o vi tri chan ma chia het"
                + " cho 2: " + product2);
        System.out.println("-----------");

        int max = arr[0];
        int min = arr[0];
        for (int i = 1; i < n; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        System.out.println("So lon nhat trong mang: " + max);
        System.out.println("-----------");
        System.out.println("So nho nhat trong mang: " + min);

    }
}
