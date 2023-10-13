/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BTVN_Buoi12;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author MSII
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Nguoi> listNg = new ArrayList<>();
        QuanLiNguoiService service = new QuanLiNguoiService();
        int menu;
        do {
            System.out.println("---MENU---");
            System.out.println("1. Nhap thong tin nguoi");
            System.out.println("2. In thong tin");
            System.out.println("3. Liet ke nguoi co gioi tinh nu");
            System.out.println("4. Liet ke nguoi co tuoi trong min - max nhap tu ban phim");
            System.out.println("5. Sap xep tang dan theo tuoi");
            System.out.println("6. Xoa nguoi theo vi tri");
            System.out.println("7. Sap xep giam dan theo ten");
            System.out.println("0. Thoat");
            System.out.println("-----------");
            System.out.println("Moi chon: ");
            menu = Integer.valueOf(sc.nextLine());
            switch (menu) {
                case 1: {
                    System.out.println("1. Nhap thong tin nguoi");
                    service.nhapTT(listNg);
                    break;
                }
                case 2: {
                    System.out.println("2. In thong tin");
                    service.inTT(listNg);
                    break;
                }
                case 3: {
                    System.out.println("3. Liet ke nguoi co gioi tinh nu");
                    System.out.println("Danh sach nguoi co gioi tinh nu la: ");
                    service.lietKeNguoiNu(listNg);
                    break;
                }
                case 4: {
                    System.out.println("4. Liet ke nguoi co tuoi trong min - max nhap tu ban phim");
                    System.out.println("Nhap tuoi min: ");
                    int min = Integer.valueOf(sc.nextLine());
                    System.out.println("Nhap tuoi max: ");
                    int max = Integer.valueOf(sc.nextLine());
                    System.out.println("Danh sach nguoi co tuoi trong khoang "+min+"-"+max+"la: ");
                    service.lietKeTuoiMinMax(listNg, min, max);
                    break;
                }
                case 5: {
                    System.out.println("5. Sap xep tang dan theo tuoi");
                    service.sapXepTangDanTheoTuoi(listNg);
                    service.inTT(listNg);
                    break;
                }
                case 6: {
                    System.out.println("6. Xoa nguoi theo vi tri");
                    System.out.println("Nhap vi tri: ");
                    int viTri = Integer.valueOf(sc.nextLine());
                    service.xoaViTri(listNg, viTri);
                    System.out.println("Danh sach nguoi sau khi xoa: ");
                    service.inTT(listNg);
                    break;
                }
                case 7: {
                    System.out.println("7. Sap xep giam dan theo ten");
                    service.sapXepGiamTheoTen(listNg);
                    service.inTT(listNg);
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
