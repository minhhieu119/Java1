/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BT2;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author MSII
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<DienThoai> list = new ArrayList<>();
        DienThoaiService service = new DienThoaiService();
        int menu;
        do {
            System.out.println("---MENU---");
            System.out.println("1. Nhap thong tin dien thoai");
            System.out.println("2. In thong tin");
            System.out.println("3. Tim dien thoai co gia nhap tu ban phim");
            System.out.println("4. Nhap vao bo nho");
            System.out.println("5. Sap xep dien thoai giam dan theo ten");
            System.out.println("6. Sap xep dien thoai tang dan theo gia");
            System.out.println("7. Xoa dien thoai theo vi tri");
            System.out.println("8. Xoa dien thoai theo ma");
            System.out.println("0. Thoat");
            System.out.println("-----------");
            System.out.println("Moi chon: ");
            menu = Integer.valueOf(sc.nextLine());
            switch (menu) {
                case 1: {
                    System.out.println("1. Nhap thong tin dien thoai");
                    service.nhapTT();
                    break;
                }
                case 2: {
                    System.out.println("2. In thong tin");
                    service.inTT();
                    break;
                }
                case 3: {
                    System.out.println("3. Tim dien thoai co gia nhap tu ban phim");
                    System.out.println("Moi nhap gia: ");
                    int gia = Integer.valueOf(sc.nextLine());
                    System.out.println("Cac dien thoai co gia = " + gia + " la: ");
                    service.timDienThoai(gia);
                    break;
                }
                case 4: {
                    System.out.println("4. Nhap vao bo nho");
                    System.out.println("Moi nhap bo nho: ");
                    int boNho = Integer.valueOf(sc.nextLine());
                    System.out.println("Cac dien thoai cos bo nho = " + boNho + " la: ");
                    service.lietKeBoNho(boNho);
                    break;
                }
                case 5: {
                    System.out.println("5. Sap xep dien thoai giam dan theo ten");
                    service.sapXepTheoTen();
                    service.inTT();
                    break;
                }
                case 6: {
                    System.out.println("6. Sap xep dien thoai tang dan theo gia");
                    service.sapXepTangDanTheoGia();
                    service.inTT();
                    break;
                }
                case 7: {
                    System.out.println("7. Xoa dien thoai theo vi tri");
                    System.out.println("Moi nhap vi tri: ");
                    int viTri = Integer.valueOf(sc.nextLine());
                    service.xoaTheoViTri(viTri);
                    System.out.println("List sau khi xoa: ");
                    service.inTT();
                    break;
                }
                case 8: {
                    System.out.println("8. Xoa dien thoai theo ma");
                    System.out.println("Moi nhap ma: ");
                    int ma = Integer.valueOf(sc.nextLine());
                    service.xoaDTTheoMa(ma);
                    service.inTT();
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
