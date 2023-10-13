/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BTVN_Buoi10;

/**
 *
 * @author MSII
 */
public class Nguoi {
    private String name;
    private int age;
    private String address;

    public Nguoi() {
    }

    public Nguoi(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    
    public void printInformation(){
        System.out.println("Thong tin nguoi: ");
        System.out.println("Ten: "+name);
        System.out.println("Tuoi: "+age);
        System.out.println("Dia chi: "+address);
    }
    
}
