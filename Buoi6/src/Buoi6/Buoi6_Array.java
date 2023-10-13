/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Buoi6;

import java.util.Scanner;

/**
 *
 * @author MSII
 */
public class Buoi6_Array {

    /**
     * Mang la tap hop chua cac phan tu cung kieu du lieu -Co 2 loai mang: +mang
     * co dinh: co dinh size. chi dc co dinh max n phan tu +mang dong: Size la
     * dong k can quan tam hay nhap cao size // -3 9 6 7 => gia tri cua cac phan
     * tu trong mang => vi tri tuong ung: 0 1 2 3 vi tri trong mang luon luon
     * bat dau bang 0 va ket thuc bang n-1 Khi nhac toi mang: - gia tri - vi tri
     * Gia tri cua vi tri dau tien : arr[0] Gia tri cua vi tri cuoi cung :
     * arr[n-1] Gia tri o vi tri i bat ki: arr[i]
     *
     * @param args
     */
    //BT1: Nhap 1 mang so nguyen gom n phan tu in mang so nguyen ra man hinh

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //B1: Nhap so luong phan tu trong mang
        System.out.println("Nhap phan tu cua mang: ");
        int n = Integer.valueOf(sc.nextLine());
        //B2: Khai bao mang
        int arr[] = new int[n];
        //B3: Nhap cac phan tu vao mang
        //cac phan tu trong mang se dc nhap tu ban phim => dung vong lap
        for (int i = 0; i < n; i++) {
            //Nhap cac so tu ban phim
            System.out.println("Nhap phan tu vi tri " + i);
            arr[i] = Integer.valueOf(sc.nextLine());
        }

        //B4: In ra man hinh
        System.out.println("Cac gia tri trong mang la: ");
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
    }
}