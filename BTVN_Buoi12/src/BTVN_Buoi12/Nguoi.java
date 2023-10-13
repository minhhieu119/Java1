/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BTVN_Buoi12;

import java.util.Scanner;

/**
 *
 * @author MSII
 */
public class Nguoi {
    Scanner sc = new Scanner(System.in);
    private String name;
    private int age;
    private int gender;
    private String hometown;
    private String job;

    public Nguoi() {
    }

    public Nguoi(String name, int age, int gender, String hometown, String job) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.hometown = hometown;
        this.job = job;
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

    public int getGender() {
        return gender;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }

    public String getHometown() {
        return hometown;
    }

    public void setHometown(String hometown) {
        this.hometown = hometown;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }
    
    public void ouput(){
        System.out.println("Ten: "+name);
        System.out.println("Tuoi: "+age);
        System.out.println("Gioi tinh: "+gender);
        System.out.println("Que quan: "+hometown);
        System.out.println("Nghe nghiep: "+job);
    }
}
