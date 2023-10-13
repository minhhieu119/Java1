/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Buoi4;

import java.util.Scanner;

/**
 *
 * @author MSII
 */
public class If_Else {

    /*
    -if(dieu kien){
        //code
    }else if(dieu kien){
        //cod
    }else{
        //cac truong hop con lai
    }
    luon luon chi co 1 if, 1 else. con lai bao nhieu dieu kien thi bang day cai
    else if
     */
    //VD: Nhap vao 1 so kiem tra day la so chan hay le
    //VD1: Nhap vao 1 so . KTra day la so >5 =5 <5.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Moi nhap so: ");
        int number = Integer.valueOf(sc.nextLine());
        if (number % 2 == 0) {
            System.out.println("Day la so chan");
        } else {
            System.out.println("Day la so le");
        }

        if (number > 5) {
            System.out.println("Day la so lon hon 5");
        } else if (number == 5) {
            System.out.println("Day la so bang 5");
        } else {
            System.out.println("Day la so nho hon 5");
        }
    }
}
