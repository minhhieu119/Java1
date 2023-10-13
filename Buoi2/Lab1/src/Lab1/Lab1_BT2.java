/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab1;

import java.util.Scanner;

/**
 *
 * @author MSII
 */
public class Lab1_BT2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Moi nhap chieu rong cua hinh chu nhat: ");
        double width = sc.nextDouble();
        System.out.println("Moi nhap chieu dai cua hinh chu nhat: ");
        double length = sc.nextDouble();
        double perimeter = (width + length) * 2;
        double area = width * length;
        double minWidthLength = Math.min(width, length);
        
        System.out.println("------------");
        System.out.println("Chu vi cua hinh chu nhat la: "+perimeter);
        System.out.println("Dien tich cua hinh chu nhat la: "+area);
        System.out.println("Canh nho nhat cua hinh chu nhat la: "+minWidthLength);
    }
}
