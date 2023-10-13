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
public class BT3_Buoi7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int menu;

        do {
            System.out.println("Moi chon: ");
            menu = Integer.valueOf(sc.nextLine());
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

                    System.out.println("------------");
                    System.out.println("Ten: " + name);
                    System.out.println("Tuoi: " + age);
                    System.out.println("Dia chi: " + address);
                    System.out.println("Can nang: " + weight);
                    System.out.println("Gioi tinh: " + gender);
                    System.out.println("Chieu cao: " + height);
                    System.out.println("Que quan: " + hometown);
                    System.out.println("------------");
                    break;
                }
                case 2: {
                    System.out.println("2. Tinh tich");
                    System.out.println("Nhap so n: ");
                    int n = Integer.valueOf(sc.nextLine());
                    int product = 1;
                    for (int i = 1; i < n + 1; i++) {
                        if (i % 2 != 0 && i % 3 == 0) {
                            product *= i;
                        }
                    }
                    System.out.println("------------");
                    System.out.println("Tich cac so le chia het cho 3: "
                            + product);
                    System.out.println("------------");
                    break;
                }
                case 3: {
                    System.out.println("3. Kiem tra so");
                    System.out.println("Nhap so n nguyen duong: ");
                    int n = Integer.valueOf(sc.nextLine());
                    if (n % 2 == 0) {
                        System.out.println("Day la so chan");
                    } else {
                        System.out.println("Day la so le");
                    }

                    break;
                }
                case 0: {
                    System.out.println("0. Thoat");
                    break;
                }
                default: {
                    System.out.println("Khong co chuc nang nay");
                }
            }
        } while (menu != 0);
    }
}
