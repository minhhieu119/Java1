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
public class BT2_Buoi7 {

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
                    System.out.println("Nhap nganh hoc: ");
                    String major = sc.nextLine();
                    System.out.println("Nhap truong hoc: ");
                    String school = sc.nextLine();
                    System.out.println("Nhap ki hoc: ");
                    int semester = Integer.valueOf(sc.nextLine());

                    System.out.println("------------");
                    System.out.println("Ten: " + name);
                    System.out.println("Tuoi: " + age);
                    System.out.println("Dia chi: " + address);
                    System.out.println("Nganh hoc: " + major);
                    System.out.println("Truong hoc: " + school);
                    System.out.println("Ki hoc: " + semester);

                    break;
                }
                case 2: {
                    System.out.println("2. Tinh tong hieu tich thuong cua "
                            + "2 so");
                    System.out.println("Nhap so thu 1: ");
                    double number1 = Double.valueOf(sc.nextLine());
                    System.out.println("Nhap so thu 2: ");
                    double number2 = Double.valueOf(sc.nextLine());
                    double tong = number1 + number2;
                    double hieu = number1 - number2;
                    double tich = number1 * number2;
                    double thuong = number1 / number2;
                    System.out.println("------------");
                    System.out.println("Tong cua 2 so: " + tong);
                    System.out.println("Hieu cua 2 so: " + hieu);
                    System.out.println("Tich cua 2 so: " + tich);
                    System.out.println("Thuong cua 2 so: " + thuong);
                    break;
                }
                case 3: {
                    System.out.println("3. Kiem tra so nguyen am");
                    System.out.println("Nhap so n: ");
                    int n = Integer.valueOf(sc.nextLine());
                    System.out.println("So nguyen am tu 0 - " + n + " la: ");
                    for (int i = 0; i < n; i++) {
                        if (i < 0) {
                            System.out.println(i);
                        }
                    }
                    System.out.println("Khong co so nguyen am tu 0 - " + n);
                }

                case 4: {
                    System.out.println("4. Kiem tra so chan");
                    System.out.println("Nhap n: ");
                    int n = Integer.valueOf(sc.nextLine());
                    int count = 0;
                    for (int i = 0; i < n + 1; i++) {
                        if (i % 2 == 0 && i % 6 == 0) {
                            ++count;
                        }
                    }
                    System.out.println("------------");
                    System.out.println("Co " + count + " so la so chan chia "
                            + "het " + "cho 6");
                    break;
                }
                case 0: {
                    System.out.println("0. Thoat");
                    System.out.println("Tam biet !");
                    break;
                }
                default: {
                    System.out.println("Khong co chuong trinh nay");
                }
            }
        } while (menu != 0);
    }
}
