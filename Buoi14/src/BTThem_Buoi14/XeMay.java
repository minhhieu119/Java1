        /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BTThem_Buoi14;

/**
 *
 * @author MSII
 */
public class XeMay {
    private String id;
    private String name;
    private String brand;
    private double cost;

    public XeMay() {
    }

    public XeMay(String id, String name, String brand, double cost) {
        this.id = id;
        this.name = name;
        this.brand = brand;
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

    
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }
    
    public void inThongTin(){
        System.out.println("Ma: "+id);
        System.out.println("Ten: "+name);
        System.out.println("Hang: "+brand);
        System.out.println("Gia: "+cost);
    }
}
