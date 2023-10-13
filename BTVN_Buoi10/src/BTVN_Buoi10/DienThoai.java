/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BTVN_Buoi10;

/**
 *
 * @author MSII
 */
public class DienThoai {
    private String id;
    private String name;
    private String phoneType;
    private float cost;
    private int capacity;
    private String color;

    public DienThoai() {
    }

    public DienThoai(String id, String name, String phoneType, float cost, int capacity, String color) {
        this.id = id;
        this.name = name;
        this.phoneType = phoneType;
        this.cost = cost;
        this.capacity = capacity;
        this.color = color;
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

    public String getPhoneType() {
        return phoneType;
    }

    public void setPhoneType(String phoneType) {
        this.phoneType = phoneType;
    }

    public float getCost() {
        return cost;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    public void printInfo(){
        System.out.println("Thong tin dien thoai: ");
        System.out.println("Ma: "+id);
        System.out.println("Ten: "+name);
        System.out.println("Dong may: "+phoneType);
        System.out.println("Gia: "+cost);
        System.out.println("Dung luong: "+capacity);
        System.out.println("Mau sac: "+color);
    }
}
