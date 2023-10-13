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
public class BTVNBuoi5_BT1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int menu;

        do {
            System.out.println("----MENU----");
            System.out.println("1. Tinh toan");
            System.out.println("2. Nhap thong tin vat ca nhan");
            System.out.println("3. Tinh tong le");
            System.out.println("4. Tinh tich chan");
            System.out.println("5. Thoat");
            System.out.println("-------------");
            System.out.println("Moi chon menu: ");
            menu = Integer.valueOf(sc.nextLine());

            switch (menu) {
                case 1: {
                    System.out.println("1. Tinh toan");
                    System.out.println("Nhap diem toan: ");
                    double math = Double.valueOf(sc.nextLine());
                    System.out.println("Nhap diem li: ");
                    double physics = Double.valueOf(sc.nextLine());
                    System.out.println("Nhap diem hoa: ");
                    double chemistry = Double.valueOf(sc.nextLine());
                    double mediumScore = (math + physics + chemistry) / 3;

                    System.out.println("--------");
                    System.out.println("Diem trung binh cua 3 mon la: "
                            + mediumScore);
                    break;
                }
                case 2: {
                    System.out.println("2. Nhap thong tin vat ca nhan");
                    System.out.println("Nhap ma vat nuoi: ");
                    String petCode = sc.nextLine();
                    System.out.println("Nhap can nang vat nuoi: ");
                    double weight = Double.valueOf(sc.nextLine());
                    System.out.println("Nhap chieu cao vat nuoi: ");
                    double height = Double.valueOf(sc.nextLine());
                    System.out.println("Nhap giong loai vat nuoi: ");
                    String species = sc.nextLine();

                    System.out.println("----------");
                    System.out.println("Ma vat nuoi: " + petCode);
                    System.out.println("Can nang: " + weight);
                    System.out.println("Chieu cao: " + height);
                    System.out.println("Giong loai: " + species);
                    break;
                }
                case 3: {
                    System.out.println("3. Tinh tong le");
                    System.out.println("Nhap so: ");
                    int n = Integer.valueOf(sc.nextLine());
                    int sum = 0;
                    for (int i = 1; i < n + 1; i++) {
                        if (i % 2 != 0) {
                            sum += i;
                        }
                    }
                    System.out.println("----------");
                    System.out.println("Tong cac so le tu 1 - " + n + " la: "
                            + sum);
                    break;
                }
                case 4: {
                    System.out.println("4. Tinh tich chan");
                    System.out.println("Nhap so: ");
                    int n = Integer.valueOf(sc.nextLine());
                    int product = 1;
                    for (int i = 1; i < n + 1; i++) {
                        if (i % 2 == 0) {
                            product *= i;
                        }
                    }
                    System.out.println("-----------");
                    System.out.println("Tich cac so chan tu 0 - " + n + " la: "
                            + product);
                    break;
                }
                case 5: {
                    System.out.println("Tam biet !");
                    break;
                }
                default: {
                    System.out.println("Khong co chuc nang nay !");
                }
            }
        } while (menu != 5);
    }
}
