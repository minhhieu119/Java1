/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BT1;

/**
 *
 * @author MSII
 */
public class DoAn {
    private String maDoAn;
    private String tenDoAn;
    private double soLuong;
    private double donGia;

    public DoAn() {
    }

    public DoAn(String maDoAn, String tenDoAn, double soLuong, double donGia) {
        this.maDoAn = maDoAn;
        this.tenDoAn = tenDoAn;
        this.soLuong = soLuong;
        this.donGia = donGia;
    }

    public String getMaDoAn() {
        return maDoAn;
    }

    public void setMaDoAn(String maDoAn) {
        this.maDoAn = maDoAn;
    }

    public String getTenDoAn() {
        return tenDoAn;
    }

    public void setTenDoAn(String tenDoAn) {
        this.tenDoAn = tenDoAn;
    }

    public double getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(double soLuong) {
        this.soLuong = soLuong;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }
    
    public void inTT(){
        System.out.println("Ma: "+maDoAn);
        System.out.println("Ten: "+tenDoAn);
        System.out.println("So luong; "+soLuong);
        System.out.println("Don gia: "+donGia);
    }
    
    public double thanhTien(){
        return donGia * soLuong;
    }
}
