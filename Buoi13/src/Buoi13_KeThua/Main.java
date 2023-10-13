/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Buoi13_KeThua;

import java.util.Scanner;

/**
 *
 * @author MSII
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ten: ");
        String name = sc.nextLine();
        System.out.println("Nhap tuoi: ");
        int age = Integer.valueOf(sc.nextLine());
        System.out.println("Nhap gioi tinh: ");
        int gender = Integer.valueOf(sc.nextLine());
        System.out.println("Nhap que quan: ");
        String hometown = sc.nextLine();
        System.out.println("Nhap SDT: ");
        String phoneNumber = sc.nextLine();
        System.out.println("Nhap email: ");
        String email = sc.nextLine();
        System.out.println("Nhap diem: ");
        double score = Double.valueOf(sc.nextLine());

        SinhVien sv = new SinhVien();
        sv.setName(name);
        sv.setAge(age);
        sv.setGender(gender);
        sv.setHometown(hometown);
        sv.setPhoneNumber(phoneNumber);
        sv.setEmail(email);
        sv.setScore(score);

        sv.display();
    }
}
