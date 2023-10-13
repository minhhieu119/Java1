/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BT2;

/**
 *
 * @author MSII
 */
public class DienThoai {
    
    private int id;
    private String name;
    private String manufacturer;
    private String color;
    private int memory;
    private int cost;

    public DienThoai() {
    }

    public DienThoai(int id, String name, String manufacturer, String color, int memory, int cost) {
        this.id = id;
        this.name = name;
        this.manufacturer = manufacturer;
        this.color = color;
        this.memory = memory;
        this.cost = cost;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public void printInfo() {
        System.out.println("Ma dien thoai: " + id);
        System.out.println("Ten dien thoai: " + name);
        System.out.println("Hang dien thoai: " + manufacturer);
        System.out.println("Mau dien thoai: " + color);
        System.out.println("Bo nho dien thoai: " + memory);
        System.out.println("Gia dien thoai: " + cost);
    }
}
