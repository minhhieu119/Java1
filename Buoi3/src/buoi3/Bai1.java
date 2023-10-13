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
public class Bai1 {

    /*
    1. Nhap chieu cao , can năng, tuoi cua nguoi yeu cu va in ra man hinh
    2. Nhap ten , khu vuc song , dia chi cua con cho nha hang xom va in
    3. Nhap ten tuoi, dia chi, chieu cao, nganh hoc, ki hoc, que quan cua ban 
    va in ra man hinh
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Moi nhap chieu cao: ");
        double height = sc.nextDouble();
        System.out.println("Moi nhap can nang: ");
        double weight = sc.nextDouble();
        System.out.println("Moi nhap tuoi: ");
        int age = sc.nextInt();

        System.out.println("Chieu cao: " + height);
        System.out.println("Can nang: " + weight);
        System.out.println("Tuoi: " + age);
    }
}
