/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BT4;

/**
 *
 * @author MSII
 */
public class DienThoai {
    private String name;
    private String manu;
    private String color;
    private int memory;
    private int cost;

    public DienThoai() {
    }

    public DienThoai(String name, String manu, String color, int memory, int cost) {
        this.name = name;
        this.manu = manu;
        this.color = color;
        this.memory = memory;
        this.cost = cost;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getManu() {
        return manu;
    }

    public void setManu(String manu) {
        this.manu = manu;
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
    
    public void inTT(){
        System.out.println("Ten: "+name);
        System.out.println("Hang: "+manu);
        System.out.println("Mau: "+color);
        System.out.println("Bo nho: "+memory);
        System.out.println("Gia: "+cost);
    }
}
