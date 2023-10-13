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
public class Bai4 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Moi nhap ten: ");
        String name = sc.nextLine();
        System.out.println("Moi nhap tuoi: ");
        int age = Integer.valueOf(sc.nextLine());
        System.out.println("Moi nhap nganh hoc: ");
        String major = sc.nextLine();
        System.out.println("Moi nhap ki hoc: ");
        int kiHoc = sc.nextInt();

        System.out.println("----------");
        System.out.println("Ten: " + name);
        System.out.println("Tuoi: " + age);
        System.out.println("Nganh hoc: " + major);
        System.out.println("Ki hoc: " + kiHoc);
    }
}
