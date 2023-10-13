/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Buoi13_KeThua;

/**
 *
 * @author MSII
 */
public class Nguoi {

    private String name;
    private int age;
    private int gender;
    private String hometown;
    private String phoneNumber;
    private String email;

    public Nguoi() {
    }

    public Nguoi(String name, int age, int gender, String hometown, String phoneNumber, String email) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.hometown = hometown;
        this.phoneNumber = phoneNumber;
        this.email = email;
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

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void display() {
        System.out.println("Ten: " + name);
        System.out.println("Tuoi: " + age);
        System.out.println("Gioi tinh: " + gender);
        System.out.println("Que quan: " + hometown);
        System.out.println("SDT: " + phoneNumber);
        System.out.println("Email: " + email);
    }
}
