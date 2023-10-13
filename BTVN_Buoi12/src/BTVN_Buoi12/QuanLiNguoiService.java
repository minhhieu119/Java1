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
public class QuanLiNguoiService {

    Scanner sc = new Scanner(System.in);

    public void nhapTT(ArrayList<Nguoi> listNg) {

        System.out.println("Nhap ten: ");
        String name = sc.nextLine();
        System.out.println("Nhap tuoi: ");
        int age = Integer.valueOf(sc.nextLine());
        System.out.println("Nhap gioi tinh(0-Nu , 1-Nam): ");
        int gender = Integer.valueOf(sc.nextLine());
        System.out.println("Nhap que quan: ");
        String hometown = sc.nextLine();
        System.out.println("Nhap nghe nghiep: ");
        String job = sc.nextLine();
        Nguoi ng = new Nguoi(name, age, gender, hometown, job);
        listNg.add(ng);
    }

    public void inTT(ArrayList<Nguoi> listNg) {
        for (Nguoi nguoi : listNg) {
            nguoi.ouput();
            System.out.println("---------");
        }

    }

    public void lietKeNguoiNu(ArrayList<Nguoi> listNg) {
        int check = 0;
        for (Nguoi nguoi : listNg) {
            if (nguoi.getGender() == 0) {
                nguoi.ouput();
                System.out.println("----------");
                check++;
            }
        }
        if (check == 0) {
            System.out.println("Khong co nu trong danh sach");
        }
    }

    public void lietKeTuoiMinMax(ArrayList<Nguoi> listNg, int min, int max) {
        int check = 0;
        for (Nguoi nguoi : listNg) {
            if (nguoi.getAge() >= min && nguoi.getAge() <= max) {
                nguoi.ouput();
                System.out.println("----------");
                check++;
            }
        }
        if (check == 0) {
            System.out.println("Khong co nguoi nao trong khoang " + min + "-" + max);
        }
    }

    public void sapXepTangDanTheoTuoi(ArrayList<Nguoi> listNg) {
        listNg.sort((o1, o2) -> {
            return o1.getAge() - o2.getAge();
        });
    }

    public void xoaViTri(ArrayList<Nguoi> listNg, int viTri) {
        listNg.remove(viTri);
    }

    public void sapXepGiamTheoTen(ArrayList<Nguoi> listNg) {
        listNg.sort((o1, o2) -> {
            return o2.getName().compareTo(o1.getName());
        });
    }
}
