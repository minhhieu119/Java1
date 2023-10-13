/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package buoi3;

import java.util.Scanner;

/**
 *
 * @author MSII
 */
public class Bai2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Moi nhap ten cua con cho: ");
        String name = sc.nextLine();
        System.out.println("moi nhap khu vuc song: ");
        String home = sc.nextLine();
        System.out.println("Moi nhap dia chi: ");
        String address = sc.nextLine();

        System.out.println("-----------");
        System.out.println("Ten cua con cho nha hang xom: " + name);
        System.out.println("Khu vuc song: " + home);
        System.out.println("Dia chi: " + address);

    }
}
