/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package B2_KieuDuLieuVaNhapXuat;

import java.util.Scanner;

/**
 *
 * @author MSII
 */
public class InOutput {

    /**
     * -Trong C nhap du lieu tu ban phim ta su dung scanf -Trong Java => Scanner
     *
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Scanner sc = new Scanner(System.in);
        //Cu phap khai bao Scanner
        // Nhap ten tu ban phim
        // co 2 cach de nhap string:
        //C1: next(); khong doc duoc dau cach
        //C2: nextLine(); nhap dc dau cach
        //System.out.print("Moi ban nhap ten: ");
        //String name = sc.next();
        //System.out.println("Moi ban nhap ten 1: ");
        //String name1 = sc.nextLine();
        //In ra man hinh
        //System.out.println("Ten 1 " + name1);
        //Nhap cac kieu du lieu khac:
        System.out.println("Moi nhap: ");
        int number = sc.nextInt();
        float number1 = sc.nextFloat();
        //B1: Nhap ten, dia chi, nganh hoc cua ban than va in ra man hinh
        //B2; Nhap tuoi, can nang, chieu cao cua ban than va in ra man hinh
        //B3: Nhap ten, tuoi, dia chi, ki hoc, nganh hoc cua nyc va in ra man
        //hinh
    }
}
