/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Buoi6;

import java.awt.BorderLayout;
import java.util.Scanner;

/**
 *
 * @author MSII
 */
public class Buoi6_BT2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int menu;

        do {
            System.out.println("Moi chon chuc nang: ");
            menu = Integer.valueOf(sc.nextLine());

            switch (menu) {
                case 1: {
                    System.out.println("1. Thong tin");
                    System.out.println("Nhap ten: ");
                    String name = sc.nextLine();
                    System.out.println("Nhap ten: ");
                    System.out.println("Nhap tuoi: ");
                    int age = Integer.valueOf(sc.nextLine());
                    System.out.println("Nhap dia chi: ");
                    String address = sc.nextLine();
                    System.out.println("Nhap ki hoc: ");
                    int semester = Integer.valueOf(sc.nextLine());
                    System.out.println("Nhap nganh hoc: ");
                    String major = sc.nextLine();

                    System.out.println("-----------");
                    System.out.println("Ten: " + name);
                    System.out.println("Tuoi: " + age);
                    System.out.println("Dia chi: " + address);
                    System.out.println("Ki hoc: " + semester);
                    System.out.println("Nganh hoc: " + major);
                    break;
                }
                case 2: {
                    System.out.println("2. Mang");
                    System.out.println("Nhap so luong phan tu cua mang: ");
                    int n = Integer.valueOf(sc.nextLine());
                    int arr[] = new int[n];
                    System.out.println("Nhap mang");
                    for (int i = 0; i < n; i++) {
                        arr[i] = Integer.valueOf(sc.nextLine());
                    }

                    int sum = 0;
                    for (int i = 0; i < n; i++) {
                        sum += arr[i];
                    }
                    
                    System.out.println("------------");
                    System.out.println("Tong cac phan tu trong mang: " + sum);
                    break;
                }
                case 0: {
                    System.out.println("0. Thoat");
                    break;
                }
                default: {
                    System.out.println("Khong co chuc nang nay !");
                }
            }

        } while (menu != 0);

    }
}
