/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Buoi5;

import java.util.Scanner;

/**
 *
 * @author MSII
 */
public class Menu_Loop {

    /**
     * Xay dung menu gom cac chuc nang sau: lap lai cho den khi gap 3 thi dung
     * 1. Nhap vao 2 so nguyen duong . Tinh thuong cua 2 so nguen day 2. nhap
     * ten tuoi dia chi cua ban than r in ra man hinh 3. thoat
     *
     * @param args
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int menu;

        do {
            System.out.println("Moi chon chuc nang: ");
            menu = Integer.valueOf(sc.nextLine());

            switch (menu) {
                case 1: {
                    System.out.println("1. Tinh thuong");
                    System.out.println("Moi nhap so 1: ");
                    int number1 = Integer.valueOf(sc.nextLine());
                    System.out.println("Moi nhap so 2: ");
                    int number2 = Integer.valueOf(sc.nextLine());

                    double division = (double) number1 / (double) number2;
                    System.out.println("Thuong cua " + number1 + " va "
                            + number2 +" la: " + division);
                    break;
                }
                case 2: {
                    System.out.println("2. Thong tin");
                    System.out.println("Moi nhap ten: ");
                    String name = sc.nextLine();
                    System.out.println("Moi nhap tuoi: ");
                    String age = sc.nextLine();
                    System.out.println("Moi nhap dia chi: ");
                    String address = sc.nextLine();

                    System.out.println("--------");
                    System.out.println("Ten: " + name);
                    System.out.println("Tuoi: " + age);
                    System.out.println("Dia chi: " + address);
                    break;
                }
                case 3: {
                    System.out.println("3. Thoat");
                    break;
                }
            }
        } while (menu != 3);
    }
}
