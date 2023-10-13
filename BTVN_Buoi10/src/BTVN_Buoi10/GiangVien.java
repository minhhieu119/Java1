/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BTVN_Buoi10;

/**
 *
 * @author MSII
 */
public class GiangVien {
    private String id;
    private String name;
    private String address;
    private float weight;
    private double height;
    private int level;

    public GiangVien() {
    }

    public GiangVien(String id, String name, String address, float weight, double height, int level) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.weight = weight;
        this.height = height;
        this.level = level;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }
    
    public void printInfo(){
        System.out.println("Thong tin giang vien");
        System.out.println("Ma: "+id);
        System.out.println("Ten: "+name);
        System.out.println("Dia chi: "+address);
        System.out.println("Can nang: "+weight);
        System.out.println("Chieu cao: "+height);
        System.out.println("Bac: "+level);
    }
}
