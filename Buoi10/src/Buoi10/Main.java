/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Buoi10;

/**
 *
 * @author MSII
 */
public class Main {

    public static void main(String[] args) {
//        // Khooi tao 1 doi tuong bang new(contructor)
//        SinhVien sv = new SinhVien();
//        //in sinh vien
//        sv.printInformation();
// Co 2 cach de in thong tin cua 1 sinh vien nao day
// c1: Su dung contructor k tham so
//        SinhVien sv = new SinhVien();
//        // B1: Khoi tao doi tuong bang contructor k tham so
//        //B2: Thay doi gia tri thuoc tinh cua doi tuong
//        sv.setName("Hieu");
//        sv.setMssv("PH46975");
//        sv.setAge(26);
//        sv.setGender(true);
//        sv.setSemester(2);
//        sv.setAddress("Ha Noi");
//        sv.setPassFacebook("123");
//        sv.printInformation();
//C2: Su dung contructor full tham so
        String mssv = "123";
        SinhVien sv = new SinhVien(mssv, "Hieu", 26, true,
                2, "Ha Noi", "123");
        sv.printInformation();
    }
}
