/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ArrayList;

/**
 *
 * @author MSII
 */
public class DongVat {
    private String animalID;
    private String name;
    private double weight;

    public DongVat() {
    }

    public DongVat(String animalID, String name, double weight) {
        this.animalID = animalID;
        this.name = name;
        this.weight = weight;
    }

    public String getAnimalID() {
        return animalID;
    }

    public void setAnimalID(String animalID) {
        this.animalID = animalID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
    
    public void printInfo(){
        System.out.println("Ma dong vat: "+animalID);
        System.out.println("Ten dong vat: "+name);
        System.out.println("Can nang dong vat: "+weight);
    }
}
