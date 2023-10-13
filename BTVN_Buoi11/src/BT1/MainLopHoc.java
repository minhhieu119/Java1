/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BT1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author MSII
 */
public class MainLopHoc {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<LopHoc> listLH = new ArrayList<>();
        System.out.println("Nhap ten: ");
        String name = sc.nextLine();
        System.out.println("Nhap toa: ");
        String building = sc.nextLine();
        System.out.println("Nhap dia chi: ");
        String address = sc.nextLine();
        System.out.println("Nhap dien tich: ");
        int area = Integer.valueOf(sc.nextLine());

        LopHoc lh = new LopHoc(name, building, address, area);
        listLH.add(lh);
        System.out.println("------------");
        for (LopHoc lopHoc : listLH) {
            lopHoc.printInfo();
        }
    }
}
