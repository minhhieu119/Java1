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
public class Lab1_BT4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Moi nhap he so 1 cua phuong trinh: ");
        int number1 = sc.nextInt();
        System.out.println("Moi nhap he so 2 cua phuong trinh: ");
        int number2 = sc.nextInt();
        System.out.println("Moi nhap he so 3 cua phuong trinh: ");
        int number3 = sc.nextInt();
        double delta = (Math.pow(number2, 2) - (4 * number1 * number3));
        double sqrtDelta = Math.sqrt(delta);
        
        System.out.println("-------------");
        System.out.println("Can delta = "+sqrtDelta);
    }
}
