/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BTVN_Buoi10;

/**
 *
 * @author MSII
 */
public class ToaHoc {
    private String id;
    private String name;
    private String habitat;

    public ToaHoc() {
    }

    public ToaHoc(String id, String name, String habitat) {
        this.id = id;
        this.name = name;
        this.habitat = habitat;
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

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }
    
    public void printInfo(){
        System.out.println("Thong tin toa hoc");
        System.out.println("Ma: "+id);
        System.out.println("Ten: "+name);
        System.out.println("Khu vuc: "+habitat);
    }
}
