/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BT5_Buoi14;

import java.util.Scanner;

/**
 *
 * @author MSII
 */
public class MainDongHo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DongHoService dh = new DongHoService();
        int menu;
        do {
            System.out.println("----MENU----");
            System.out.println("1. Nhap thong tin");
            System.out.println("2. In thong tin");
            System.out.println("3. Tim kiem dong ho theo khong gia");
            System.out.println("4. Xoa dong ho theo ma");
            System.out.println("5. Sap xep dong ho theo kich thuoc tang dan");
            System.out.println("6. Sap xep dong ho theo kich thuoc giam dan");
            System.out.println("0. Thoat");
            System.out.println("-------------");
            System.out.println("Moi chon: ");
            menu = Integer.valueOf(sc.nextLine());

            switch (menu) {
                case 1: {
                    System.out.println("1. Nhap thong tin");
                    dh.nhapThongTin();
                    break;
                }
                case 2: {
                    System.out.println("2. In thong tin");
                    dh.inThongTin();
                    break;
                }
                case 3: {
                    System.out.println("3. Tim kiem dong ho theo khong gia");
                    System.out.println("Nhap gia min: ");
                    int min = Integer.valueOf(sc.nextLine());
                    System.out.println("Nhap gia max: ");
                    int max = Integer.valueOf(sc.nextLine());
                    dh.timTheoKhoangGia(min, max);
                    break;
                }
                case 4: {
                    System.out.println("4. Xoa dong ho theo ma");
                    System.out.println("Moi nhap ma muon xoa: ");
                    int ma = Integer.valueOf(sc.nextLine());
                    dh.xoaTheoMa(ma);
                    System.out.println("Danh sach sau khi xoa: ");
                    dh.inThongTin();
                    break;
                }
                case 5: {
                    System.out.println("5. Sap xep dong ho theo kich thuoc tang dan");
                    dh.sapXepTangDan();
                    dh.inThongTin();
                    break;
                }
                case 6: {
                    System.out.println("6. Sap xep dong ho theo kich thuoc giam dan");
                    dh.sapXepGiam();
                    dh.inThongTin();
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
