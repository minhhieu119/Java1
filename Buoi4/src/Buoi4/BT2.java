/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Buoi4;

import java.util.Scanner;

/**
 *
 * @author MSII
 */
public class BT2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Moi chon menu: ");
        int menu = Integer.valueOf(sc.nextLine());
        switch (menu) {
            case 1: {
                System.out.println("1. Thong tin ca nhan");
                System.out.println("Nhap ten: ");
                String name = sc.nextLine();
                System.out.println("Nhap tuoi: ");
                int age = Integer.valueOf(sc.nextLine());
                System.out.println("Nhap dia chi: ");
                String address = sc.nextLine();
                System.out.println("Nhap can nang: ");
                double weight = Double.valueOf(sc.nextLine());
                System.out.println("Nhap gioi tinh: ");
                String gender = sc.nextLine();
                System.out.println("Nhap chieu cao: ");
                double height = Double.valueOf(sc.nextLine());
                System.out.println("Nhap que quan: ");
                String hometown = sc.nextLine();

                System.out.println("----------");
                System.out.println("Ten: " + name);
                System.out.println("Tuoi: " + age);
                System.out.println("Dia chi: " + address);
                System.out.println("Can nang: " + weight);
                System.out.println("Gioi tinh: " + gender);
                System.out.println("Chieu cao: " + height);
                System.out.println("Que quan: " + hometown);

                break;
            }
            case 2: {
                System.out.println("2. Tich cac so le chia het cho 3 "
                        + "tu 1 toi n");
                int n;
                System.out.println("Moi nhap so n: ");
                n = Integer.valueOf(sc.nextLine());
                int product = 1;
                for (int i = 3; i <= n; i++) {
                    if (i % 2 != 0) {
                        if (i % 3 == 0) {
                            product *= i;
                        }
                    }
                }
                System.out.println("Tich cac so le chia het cho 3 tu 1 den "
                        + n + " la: " + product);

                break;
            }
            case 3: {
                System.out.println("3. Kiem tra");
                int n;
                System.out.println("Moi nhap n nguyen am: ");
                n = Integer.valueOf(sc.nextLine());
                int count = 0;
                if (n < 0) {
                    for (int i = 0; i >= n; i--) {
                        if (i % 5 == 0) {
                            ++count;
                        }
                    }
                    System.out.println("Co " + count + " so chia het cho "
                            + "5 nguyen " + "am");
                } else {
                    System.out.println(n + " khong phai la so nguyen am");
                }
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
    }
}
