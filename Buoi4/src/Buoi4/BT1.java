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
public class BT1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Moi chon menu: ");
        int menu = Integer.valueOf(sc.nextLine());
        switch (menu) {
            case 1: {
                System.out.println("1. Thong tin ca nhan");
                System.out.println("Moi nhap ten: ");
                String name = sc.nextLine();
                System.out.println("Moi nhap tuoi: ");
                int age = Integer.valueOf(sc.nextLine());
                System.out.println("Moi nhap dia chi: ");
                String address = sc.nextLine();
                System.out.println("Moi nhap nganh hoc: ");
                String major = sc.nextLine();
                System.out.println("Moi nhap truong hoc: ");
                String school = sc.nextLine();
                System.out.println("Moi nhap ki hoc: ");
                String semester = sc.nextLine();

                System.out.println("---------");
                System.out.println("Ten: " + name);
                System.out.println("Tuoi: " + age);
                System.out.println("Dia chi: " + address);
                System.out.println("Nganh hoc: " + major);
                System.out.println("Truong hoc: " + school);
                System.out.println("Ki hoc: " + semester);
                break;
            }
            case 2: {
                System.out.println("2. Tinh tong, hieu, tich, thuong cua 2 so");
                System.out.println("Nhap so thu nhat: ");
                int number1 = Integer.valueOf(sc.nextLine());
                int number2 = Integer.valueOf(sc.nextLine());

                int tong = number1 + number2;
                int hieu = number1 - number2;
                int tich = number1 * number2;
                double thuong = (double) number1 / (double) number2;

                System.out.println("----------");
                System.out.println("Tong cua 2 so: " + tong);
                System.out.println("Hieu cua 2 so: " + hieu);
                System.out.println("Tich cua 2 so: " + tich);
                System.out.println("Thuong cua 2 so: " + thuong);

                break;
            }
            case 0: {
                System.out.println("Thoat");
            }
            default:
                System.out.println("Khong co chuong trinh nay");
        }
    }
}
