/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package BTVN_Buoi2;

import java.util.Scanner;

/**
 *
 * @author MSII
 */
public class BT1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Moi nhap ten cua ban: ");
        String name = sc.nextLine();
        System.out.println("Moi nhap dia chi cua ban: ");
        String address = sc.nextLine();
        
        System.out.println("------------------");
        System.out.println("Ten: " + name);
        System.out.println("Dia chi: " + address);
    }

}
