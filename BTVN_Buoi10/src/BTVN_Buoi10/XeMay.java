/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BTVN_Buoi10;

/**
 *
 * @author MSII
 */
public class XeMay {
    private String id;
    private String name;
    private String type;
    private float cost;
    private String color;

    public XeMay() {
    }

    public XeMay(String id, String name, String type, float cost, String color) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.cost = cost;
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public float getCost() {
        return cost;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void printInfo(){
        System.out.println("Thong tin xe may");
        System.out.println("Ma: "+id);
        System.out.println("Ten: "+name);
        System.out.println("Dong may: "+type);
        System.out.println("Gia tien: "+cost);
        System.out.println("Mau sac: "+color);
    }
    
    
}
