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
public class XeDap extends PhuongTienGiaoThong{
    Scanner sc = new Scanner(System.in);
    private String hangSX;

    public XeDap(String hangSX, double giaThanh, String mauSac) {
        super(giaThanh, mauSac);
        this.hangSX = hangSX;
    }

    public XeDap() {
    }

    //Ghi de phuong thuc

    @Override
    public void xuat() {
        super.xuat();
        System.out.println("Hang san xuat: "+hangSX);
        
// Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
    
    
    
    
}
