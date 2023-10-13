/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TutorBuoi5;

import java.util.Scanner;

/**
 *
 * @author MSII
 */
public class PhuongTienGiaoThong {
    Scanner sc = new Scanner(System.in);
    private double giaThanh;
    private String mauSac;

    public PhuongTienGiaoThong() {
    }

    public PhuongTienGiaoThong(double giaThanh, String mauSac) {
        this.giaThanh = giaThanh;
        this.mauSac = mauSac;
    }
    
    
    public void nhap(){
        System.out.println("Nhap gia thanh: ");
        giaThanh = Double.valueOf(sc.nextLine());
        System.out.println("Nhap mau sac: ");
        mauSac = sc.nextLine();
    }
    
    public void xuat(){
        System.out.println("Gia thanh: "+giaThanh);
        System.out.println("Mau sac: "+mauSac);
    }

    public Scanner getSc() {
        return sc;
    }

    public void setSc(Scanner sc) {
        this.sc = sc;
    }

    public double getGiaThanh() {
        return giaThanh;
    }

    public void setGiaThanh(double giaThanh) {
        this.giaThanh = giaThanh;
    }

    public String getMauSac() {
        return mauSac;
    }

    public void setMauSac(String mauSac) {
        this.mauSac = mauSac;
    }
    
    
}
