/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package B2_KieuDuLieuVaNhapXuat;

import java.util.Scanner;

/**
 *
 * @author MSII
 */
public class BT1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.println("Moi nhap ten: ");
//        String name = sc.nextLine();
//        System.out.print("Moi nhap dia chi: ");
//        String address = sc.nextLine();
//        System.out.println("Moi nhap nganh : ");
//        String major = sc.nextLine();
//        
//        System.out.println("Ten: "+name);
//        System.out.println("Dia chi: "+address);
//        System.out.println("Nganh hoc: "+major);
        System.out.println("Moi nhap tuoi: ");
        int age = sc.nextInt();
        System.out.println("Moi nhap can nang: ");
        int weight = sc.nextInt();
        System.out.println("Moi nhap chieu cao; ");
        int height = sc.nextInt();
        
        System.out.println("Tuoi: "+age);
        System.out.println("Can nang: "+weight);
        System.out.println("Chieu cao: "+height);
    }
}
