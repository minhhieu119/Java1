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
public class Lab1_BT1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Moi nhap ho va ten: ");
        String fullname = sc.nextLine();
        System.out.println("Moi nhap diem trung binh: ");
        double diemTrungBinh = sc.nextDouble();
        
        System.out.println("----------");
        System.out.println(fullname+" "+diemTrungBinh+" diem.");
    }
}
