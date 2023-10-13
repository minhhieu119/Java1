/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BTVN_Buoi10;

/**
 *
 * @author MSII
 */
public class MainFixCung {

    public static void main(String[] args) {
        Nguoi ng = new Nguoi();
        ng.setName("Hieu");
        ng.setAge(26);
        ng.setAddress("Ha Noi");
        ng.printInformation();
        System.out.println("-----------------");

        DongVat dv = new DongVat();
        dv.setIdPet("a123");
        dv.setName("Hao");
        dv.setAge(5);
        dv.setWeight(20.5);
        dv.printInformation();
        System.out.println("-----------------");

        ThucVat tv = new ThucVat();
        tv.setIdPlants("h1234");
        tv.setName("Hoa huong duong");
        tv.setAge(2);
        tv.setHeight(10.5);
        tv.setHabitat("Dong hoa huong duong");
        tv.display();
        System.out.println("-----------------");

        LopHoc lh = new LopHoc();
        lh.setName("SD19202");
        lh.setBuilding("A");
        lh.setAddress("Kieu Mai");
        lh.setArea(30);
        lh.printInfo();
        System.out.println("-----------------");

        MayTinh mt = new MayTinh();
        mt.setId("D1540");
        mt.setName("Dell XPS");
        mt.setComType("Phan khuc cao");
        mt.setCost(50);
        mt.printInfo();
        System.out.println("-----------------");

        DienThoai dt = new DienThoai("0976", "Iphone 15 pro",
                "Pro", (float) 30.5, 256, "Black");
        dt.printInfo();
        System.out.println("-----------------");

        GiangVien gv = new GiangVien("FE23456", "Thao", "Ha Noi",
                (float) 60.5, 180.4, 2);
        gv.printInfo();
        System.out.println("-----------------");

        CayCoi cc = new CayCoi("AB123", "Cay xoai", "Vuon nha",
                (float) 20.4);
        cc.printInfo();
        System.out.println("-----------------");

        XeMay xm = new XeMay("AC1102", "Air Blade", "150cc",
                (float) 50.5, "red");
        xm.printInfo();
        System.out.println("-----------------");

        ToaHoc th = new ToaHoc("A", "FPT Poly", "Kieu Mai");
        th.printInfo();
        System.out.println("-----------------");
    }
}
