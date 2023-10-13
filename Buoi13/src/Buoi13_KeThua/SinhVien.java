/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Buoi13_KeThua;

/**
 *
 * @author MSII
 */
public class SinhVien extends Nguoi{
    /*
    -Tinh ke thua: extends . Class con se ke thua casc thuoc tinh phuong thuc 
    cua class cha(tru cac thuoc tinh va phuong thuc private)
    */
    private double score;
    //SinhVien co 7 thuoc tinh

    public SinhVien() {
    }

    public SinhVien(double score, String name, int age, int gender, String hometown, String phoneNumber, String email) {
        super(name, age, gender, hometown, phoneNumber, email);
        this.score = score;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }
    
    public void display(){
        //De lay dc cac thuoc tinh hoac phuong thuc cha: dung super
//        System.out.println("Ten: "+super.getName());
//        System.out.println("Tuoi: "+super.getAge());
//        System.out.println("Gioi tinh: "+super.getGender());
//        System.out.println("QueSystem quan: "+super.getHometown());
//        System.out.println("SDT: "+super.getPhoneNumber());
//        System.out.println("Email: "+super.getEmail());
        super.display();
        System.out.println("Diem: "+score);
    }
}
