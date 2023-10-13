/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BT5_Buoi14;

/**
 *
 * @author MSII
 */
public class DongHo {
    private int id;
    private String type;
    private String color;
    private int width;
    private String material;
    private int cost;

    public DongHo() {
    }

    public DongHo(int id, String type, String color, int width, String material, int cost) {
        this.id = id;
        this.type = type;
        this.color = color;
        this.width = width;
        this.material = material;
        this.cost = cost;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }
    
    public void inTT(){
        System.out.println("Ma: "+id);
        System.out.println("The loai: "+type);
        System.out.println("Mau sac: "+color);
        System.out.println("Kich thuoc: "+width);
        System.out.println("Chat lieu: "+material);
        System.out.println("Gia: "+cost);
    }
}
