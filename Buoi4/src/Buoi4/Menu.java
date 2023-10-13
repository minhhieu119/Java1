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
public class Menu {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Moi nhap chuc nang: ");
        int chucNang = Integer.valueOf(sc.nextLine());
        switch (chucNang) {
            case 1: {
                System.out.println("1. Tinh tong cua 2 so nguyen nhap tu ban "
                        + "phim");
                System.out.println("Moi nhap so thu nhat: ");
                int number1 = Integer.valueOf(sc.nextLine());
                System.out.println("Moi nhap so thu hai: ");
                int number2 = Integer.valueOf(sc.nextLine());
                int sum = number1 + number2;

                System.out.println("----------");
                System.out.println("Tong cua " + number1 + " va " + number2
                        + " la: " + sum);
                break;
            }
            case 2: {
                System.out.println("2. Nhap tu ban phim thong tin ca nhan"
                        + " va in ra man hinh");
                System.out.println("Moi nhap thong tin ca nhan:");
                System.out.println("Ten: ");
                String name = sc.nextLine();
                System.out.println("Tuoi: ");
                String age = sc.nextLine();
                System.out.println("Que quan: ");
                String hometown = sc.nextLine();

                System.out.println("--------");
                System.out.println("Ten: " + name);
                System.out.println("Tuoi: " + age);
                System.out.println("Que quan: " + hometown);
                break;
            }
            case 3: {
                System.out.println("Thoat");
            }
            default: {
                System.out.println("Khong co chuc nang nay");
            }
        }
    }
}
