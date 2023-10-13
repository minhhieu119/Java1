/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BT4;

import java.util.Scanner;

/**
 *
 * @author MSII
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        QLDienThoai dt = new QLDienThoai();
        int menu;
        do {
            System.out.println("---MENU---");
            System.out.println("1. Nhap thong tin dien thoai");
            System.out.println("2. In thong tin");
            System.out.println("0. Thoat");
            System.out.println("-----------");
            System.out.println("Moi chon: ");
            menu = Integer.valueOf(sc.nextLine());

            switch (menu) {
                case 1: {
                    System.out.println("1. Nhap thong tin dien thoai");
                    dt.nhapThongTin();
                    break;
                }
                case 2: {
                    System.out.println("In thong tin");
                    dt.inThongTin();
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
