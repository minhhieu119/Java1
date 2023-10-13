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
public class Switch_Case {

    /**
     * int, String => truyen ten bien kieu so nguyen hoac ki tu switch(ten
     * bien){ case gia tri{ //code break; }// So luong case khong gioi han
     * default:{ //cac truong hop con lai break; }
     */

    // Bai 1: Nhap vao mot thang kieu so nguyen kiem tra day la thang nao trong
    //nam
    //Bai 2: Tao 1 menu gom nhung chuc nang sau
    //1. Tinh tong cua 2 so nguyennhap tu ban phim
    //2. Nhap tu ban phim thong tin ca nhan cua ban than va in ra man hinh
    //3. Thoat
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao thang: ");
        int month = Integer.valueOf(sc.nextLine());
        switch (month) {
            case 1: {
                System.out.println("Day la thang 1");
                break;
            }
            case 2: {
                System.out.println("Day la thang 2");
                break;
            }
            case 3: {
                System.out.println("Day la thang 3");
                break;
            }
            case 4: {
                System.out.println("Day la thang 4");
                break;
            }
            case 5: {
                System.out.println("Day la thang 5");
                break;
            }
            case 6: {
                System.out.println("Day la thang 6");
                break;
            }
            case 7: {
                System.out.println("Day la thang 7");
                break;
            }
            case 8: {
                System.out.println("Day la thang 8");
                break;
            }
            case 9: {
                System.out.println("Day la thang 9");
                break;
            }
            case 10: {
                System.out.println("Day la thang 10");
                break;
            }
            case 11: {
                System.out.println("Day la thang 11");
                break;
            }
            case 12: {
                System.out.println("Day la thang 12");
                break;
            }
            default: {
                System.out.println("Day khong la thang nao trong nam");
                break;
            }
        }

    }
}
