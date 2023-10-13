/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ArrayList;

import java.util.ArrayList;

/**
 *
 * @author MSII
 */
public class Main {

    /**
     * Mang trong C: Bat buoc phai nhap vao size roi ms khai bao mang => lang
     * phi bo nho => mang dong: khong can quan tam toi size cua phan tu
     * =>Collections. j1: ArrayList Cu phap:
     */
//    ArrayList<Kieu du lieu> ten bien = new ArrayList<>();
    public static void main(String[] args) {
        ArrayList<String> haongu = new ArrayList<>();
        //Kiem tra size 
        System.out.println(haongu.size());
        //Them phan tu cho mang: add
        haongu.add("Qua ngu");
        haongu.add("Baka");
        System.out.println("Size luc sau = " + haongu.size());
        //Xoa phan tu
//        haongu.remove(1);
//        System.out.println("Size luc sau = " + haongu.size());
//        //remove truyen vao vi tri can xoa
//        haongu.remove("Baka");
//        Lay gia tri i trong mang dong:
        //haongu.get(i);
        //in cac phan tu trong mang
        /**
         * C1: for thuong(for i)
         *
         */
//        for (int i = 0; i < haongu.size(); i++) {
//            System.out.println(haongu.get(i));
//        }
//C2:
//        for (String string : haongu) {
//            System.out.println(string);
//        }
        //C3: for each + lamda(->) java8
//        haongu.forEach(s -> System.out.println(s));
        //BT: Tao 1 class dong vat gom cac thuoc tinh maDV-string
        //ten - string, can nang - double va cac contructor getter setter
        // inThongTin(): void
        // Tao class Main. 
        //Su dung ArrayList de luu thong tin cua doi tuong dong 
        //vat vua nhap tu ban phim va in ra man hinh
        
    }
}
