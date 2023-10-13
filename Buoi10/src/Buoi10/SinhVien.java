/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Buoi10;

/**
 *
 * @author MSII
 */
public class SinhVien {

    private String mssv;
    private String name;
    private int age;
    private boolean gender;
    private int semester;
    private String address;
    private String passFacebook;

    // C1: chuot phai - insertcode
//    public SinhVien() {
//    }
//
//    public SinhVien(String mssv, String name, int age, boolean gender,
//            int semester, String address, String passFacebook) {
//        this.mssv = mssv;
//        this.name = name;
//        this.age = age;
//        this.gender = gender;
//        this.semester = semester;
//        this.address = address;
//        this.passFacebook = passFacebook;
//    }
    // C2: ctrl + space 2 lan
    /**
     * Constructor: Dau hieu nhan biet:
     * - Ten trung vs ten class
     * - Contructor k co kieu du lieu tra ve(k co return)
     * Contructor dung de khoi tao 1 dooi tuong
     * Co 2 loai contructor:
     * +Co tham so
     * +K tham so
     * Default cua 1 class la loai contructor k tham so
     */
    public SinhVien() {
    }

    public SinhVien(String mssv, String name, int age, boolean gender, 
            int semester, String address, String passFacebook) {
        this.mssv = mssv;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.semester = semester;
        this.address = address;
        this.passFacebook = passFacebook;
    }
    // Getter: Lay ra thoong tin cua thuoc tinh cua doi tuong
    public String getMssv() {
        return mssv;
    }
    //setter : thay doi gia tri thuoc tinh cua doi tuong
    public void setMssv(String mssv) {
        this.mssv = mssv;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPassFacebook() {
        return passFacebook;
    }

    public void setPassFacebook(String passFacebook) {
        this.passFacebook = passFacebook;
    }
    // Ham => public
    //in tat ca thong tin sinh vien ra man hinh
    public void printInformation(){
        System.out.println("MSSV = "+mssv);
        System.out.println("Ten = "+name);
        System.out.println("Tuoi = "+age);
        System.out.println("Gioi tinh = "+gender);
        System.out.println("Ki hoc = "+semester);
        System.out.println("Dia chi = "+address);
        System.out.println("Mat khau Facebook = "+passFacebook);
    }
}
