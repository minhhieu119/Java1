/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Buoi7;

import java.util.Scanner;

/**
 *
 * @author MSII
 */
public class BT1_Buoi7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap phan tu cua mang: ");
        int n = Integer.valueOf(sc.nextLine());
        int arr[] = new int[n];
        System.out.println("--------------");
        System.out.println("Nhap mang");
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap phan tu thu " + i);
            arr[i] = Integer.valueOf(sc.nextLine());
        }
        System.out.println("-------------");
        System.out.println("Xuat mang");
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }

        int product = 1;
        for (int i = 0; i < n; i++) {
            if (i % 2 != 0) {
                product *= arr[i];
            }
        }
        System.out.println("--------------");
        System.out.println("Tich cac phan tu o vi tri le: " + product);

        int max = arr[0];
        for (int i = 1; i < n; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        System.out.println("---------------");
        System.out.println("Vi tri phan tu lon nhat: ");
        for (int i = 0; i < n; i++) {
            if (max == arr[i]) {
                System.out.println(i);
            }
        }

        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] < 0) {
                ++count;
            }
        }
        System.out.println("--------------");
        System.out.println("Co " + count + " phan tu la so nguyen am trong mang");

        int sum = 0;
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0 && arr[i] % 3 == 0) {
                sum += arr[i];
            }
        }
        System.out.println("--------------");
        System.out.println("Tong cua cac phan tu o vi tri chan chia het "
                + "cho 3: " + sum);
    }
}
