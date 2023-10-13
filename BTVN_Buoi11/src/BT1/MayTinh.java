/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BT1;

/**
 *
 * @author MSII
 */
public class MayTinh {
    private String comID;
    private String name;
    private String comType;
    private float cost;

    public MayTinh() {
    }

    public MayTinh(String comID, String name, String comType, float cost) {
        this.comID = comID;
        this.name = name;
        this.comType = comType;
        this.cost = cost;
    }

    public String getComID() {
        return comID;
    }

    public void setComID(String comID) {
        this.comID = comID;
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
        System.out.println("Ma may: "+comID);
        System.out.println("Ten: "+name);
        System.out.println("Dong may: "+comType);
        System.out.println("Gia: "+cost);
    }
}
