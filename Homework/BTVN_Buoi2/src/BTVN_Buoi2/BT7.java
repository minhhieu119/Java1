/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BTVN_Buoi2;

import java.util.Scanner;

/**
 *
 * @author MSII
 */
public class BT7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Moi nhap so nguyen: ");
        int number = sc.nextInt();
        
        if(number % 2 == 0){
            System.out.println("So "+number+" khong phai la so le");
        }
        else{
            if(number % 5 == 0){
                System.out.println("So "+number+" la so le chia het cho 5");
            }
            else{
                System.out.println("So "+number+" la so le nhung khong chia het cho 5");
            }
        }
    }
}
