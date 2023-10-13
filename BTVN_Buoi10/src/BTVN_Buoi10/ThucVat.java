/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BTVN_Buoi10;

/**
 *
 * @author MSII
 */
public class ThucVat {
    private String idPlants;
    private String name;
    private int age;
    private double height;
    private String habitat;

    public ThucVat() {
    }

    public ThucVat(String idPlants, String name, int age, double height, String habitat) {
        this.idPlants = idPlants;
        this.name = name;
        this.age = age;
        this.height = height;
        this.habitat = habitat;
    }

    public String getIdPlants() {
        return idPlants;
    }

    public void setIdPlants(String idPlants) {
        this.idPlants = idPlants;
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

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }
    
    public void display(){
        System.out.println("Thong tin thuc vat: ");
        System.out.println("Ma thuc vat: "+idPlants);
        System.out.println("Ten: "+name);
        System.out.println("Tuoi: "+age);
        System.out.println("Chieu cao: "+height);
        System.out.println("Khu vuc song: "+habitat);
    }
}
