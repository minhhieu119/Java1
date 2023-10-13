/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TutorBuoi5;

/**
 *
 * @author MSII
 */
public class QuanLiXe {

    public static void main(String[] args) {
        PhuongTienGiaoThong phuongTien = new PhuongTienGiaoThong();
        XeDap xDap = new XeDap();
//        System.out.println(xDap.mauSac);
//        xDap.nhap();
//        System.out.println(xDap.getGiaThanh());
        XeDap xDap2 = new XeDap("yamaha", 15, "do");
        xDap2.xuat();
    }
}
