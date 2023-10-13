/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BTVN_Buoi10;

/**
 *
 * @author MSII
 */
public class MayTinh {
    private String id;
    private String name;
    private String comType;
    private float cost;

    public MayTinh() {
    }

    public MayTinh(String id, String name, String comType, float cost) {
        this.id = id;
        this.name = name;
        this.comType = comType;
        this.cost = cost;
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

    public String getComType() {
        return comType;
    }

    public void setComType(String comType) {
        this.comType = comType;
    }

    public float getCost() {
        return cost;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }
    
    public void printInfo(){
        System.out.println("Thong tin may tinh: ");
        System.out.println("Ma: "+id);
        System.out.println("Ten: "+name);
        System.out.println("Dong may: "+comType);
        System.out.println("Gia tien: "+cost);
    }
}
