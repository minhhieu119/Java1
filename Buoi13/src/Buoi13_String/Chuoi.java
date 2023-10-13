/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Buoi13_String;

/**
 *
 * @author MSII
 */
public class Chuoi {
    
    public static void main(String[] args) {
        String str = "HieuDZ";
        //do dai cuar 1 chuoi: 
        System.out.println(str.length());
        //so sanh 2 chuoi
        //CompareTo: phan biet hoa thuong tra vee int
        //CompareToIgnoCase: ko phan biet hoa thuong
        System.out.println(str.compareTo("HaoNgu"));
        //>0 : Chuoi 1 lon hon chuoi 2
        //=0: Chuoi 1 bang chuoi 2
        //<0 chuoi 1 nho hon chuoi 2
        //Dua vao bang ma ASCII cong don ca ki tu
        System.out.println();
        // equals: So sanh chuoi phan biey hoa thuong tra ve booleean
        //equalsInogeCase: ko phan biet hoa thuong 
        System.out.println(str.equals("Hieu"));
        System.out.println(str.equalsIgnoreCase("hieudz"));

        //Ham viet hoa het:toUpperCase
        System.out.println(str.toUpperCase());
        //Ham viet thuong het: toLowerCase
        System.out.println(str.toLowerCase());
        //Xoa khoang cach dau va cuoi: trim()
        System.out.println(str.trim());

        //Xoa khoang cach giua trong java: regex (dung matches)
        //str.matches(regex)
        //Kiem tra chua su xuat hien cua 1 chuoi khac trong chuoi ban dau
        //Ham contains()
        System.out.println(str.toLowerCase().contains("h".toLowerCase()));
        //Kiem tra ki tu bat dau
        System.out.println(str.startsWith("h"));
        System.out.println(str.endsWith("d"));
    }
    
}
