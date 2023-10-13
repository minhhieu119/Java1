/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Buoi10;

import java.util.Scanner;

/**
 *
 * @author MSII
 */
public class MainPrint {

    //2. Nhap du lieu cua 1 doi tuong sinh vien tu ban phim va in
    public static void main(String[] args) {
        //SV: & thuoc tinh
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ten: ");
        String name = sc.nextLine();
        System.out.println("Nhap tuoi: ");
        int age = Integer.valueOf(sc.nextLine());
        System.out.println("Nhap ma so sinh vien: ");
        String mssv = sc.nextLine();
        System.out.println("Nhap gioi tinh: ");
        boolean gender = Boolean.valueOf(sc.nextLine());
        System.out.println("Nhap ki hoc: ");
        int semester = Integer.valueOf(sc.nextLine());
        System.out.println("Nhap dia chi: ");
        String address = sc.nextLine();
        System.out.println("Nhap mat khau facebook: ");
        String passFacebook = sc.nextLine();
        //B2: Khoi tao doi tuong
//        SinhVien sv = new SinhVien();
//        sv.setMssv(mssv);
//        sv.setName(name);
//        sv.setAge(age);
//        sv.setAddress(address);
//        sv.setGender(gender);
//        sv.setSemester(semester);
//        sv.setPassFacebook(passFacebook);
//        sv.printInformation();
        SinhVien sv = new SinhVien(mssv, name, age, gender, semester, address, passFacebook);
        sv.printInformation();
    }
}
