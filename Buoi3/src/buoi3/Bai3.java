/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package buoi3;

import java.util.Scanner;

/**
 *
 * @author MSII
 */
public class Bai3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Moi nhap ten: ");
        String name = sc.nextLine();
        System.out.println("Moi nhap tuoi: ");
        int age = Integer.valueOf(sc.nextLine());
        // c1: them nextLine();
        //C2: ep kieu: 
        //int age = scan.nextLine();
        //ep string => integer
        //int age = Integer.valuaof(ageStr);
        //Float.valuaof(name);
        //Coi tat ca moi thu nhap tu ban phim vao
        //luon luon la chuoi
        // Sau do moi ep kieu ve du lieu tuong ung
        System.out.println("Moi nhap dia chi: ");
        String address = sc.nextLine();
        System.out.println("Moi nhap chieu cao: ");
        double height = Double.valueOf(sc.nextLine());
        System.out.println("Moi nhap nganh hoc; ");
        String major = sc.nextLine();
        System.out.println("Moi nhap ki hoc: ");
        int kiHoc = Integer.valueOf(sc.nextLine());
        System.out.println("Moi nhap que quan: ");
        String hometown = sc.nextLine();

        System.out.println("------");
        System.out.println("Ten: " + name);
        System.out.println("Tuoi: " + age);
        System.out.println("Dia chi: " + address);
        System.out.println("Chieu cao: " + height);
        System.out.println("Nganh hoc: " + major);
        System.out.println("Ki hoc: " + kiHoc);
        System.out.println("Que quan: " + hometown);
    }
}
