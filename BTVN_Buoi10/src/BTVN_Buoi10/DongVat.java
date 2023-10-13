/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BTVN_Buoi10;

/**
 *
 * @author MSII
 */
public class DongVat {
    private String idPet;
    private String name;
    private int age;
    private double weight;

    public DongVat() {
    }

    public DongVat(String idPet, String name, int age, double weight) {
        this.idPet = idPet;
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public String getIdPet() {
        return idPet;
    }

    public void setIdPet(String idPet) {
        this.idPet = idPet;
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

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
    
    public void printInformation(){
        System.out.println("Thong tin dong vat: ");
        System.out.println("Ma dong vat: "+idPet);
        System.out.println("Ten: "+name);
        System.out.println("Tuoi: "+age);
        System.out.println("Can nang: "+weight);
    }
}
