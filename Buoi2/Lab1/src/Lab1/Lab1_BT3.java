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
public class Lab1_BT3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Moi nhap canh cua khoi lap phuong: ");
        double edge = sc.nextDouble();
        double volume = Math.pow(edge, 3);
        
        System.out.println("----------");
        System.out.println("The tich cua khoi lap phuong la: "+volume);
    }
}
