/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BTVN_Buoi4;

import java.util.Scanner;

/**
 *
 * @author MSII
 */
public class BTVN_Buoi4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Moi chon: ");
        int menu = Integer.valueOf(sc.nextLine());
        switch (menu) {
            case 1: {
                System.out.println("1. Tinh toan");
                double number1, number2, number3;
                System.out.println("Moi nhap so 1: ");
                number1 = Double.valueOf(sc.nextLine());
                System.out.println("Moi nhap so 2: ");
                number2 = Double.valueOf(sc.nextLine());
                System.out.println("Moi nhap so 3: ");
                number3 = Double.valueOf(sc.nextLine());

                double addition = number1 + number2 + number3;
                double subtraction = number1 - number2 - number3;
                double multiplication = number1 * number2 * number3;
                double division = number1 / number2
                        / number3;

                System.out.println("---------");
                System.out.println("Tong cua 3 so: " + addition);
                System.out.println("Hieu cua 3 so: " + subtraction);
                System.out.println("Tich cua 3 so: " + multiplication);
                System.out.println("Thuong cua 3 so: " + division);
                break;
            }
            case 2: {
                System.out.println("2. Nhap thong tin ca nhan");
                System.out.println("Nhap ten: ");
                String name = sc.nextLine();
                System.out.println("Nhap tuoi: ");
                int age = Integer.valueOf(sc.nextLine());
                System.out.println("Nhap que quan: ");
                String hometown = sc.nextLine();
                System.out.println("Nhap can nang: ");
                double weight = Double.valueOf(sc.nextLine());
                System.out.println("Nhap ki hoc: ");
                int semester = Integer.valueOf(sc.nextLine());
                System.out.println("Nhap chuyen nganh: ");
                String major = sc.nextLine();
                System.out.println("Nhap so nha: ");
                int houseNumber = Integer.valueOf(sc.nextLine());
                System.out.println("Nhap xa: ");
                String ward = sc.nextLine();
                System.out.println("Nhap dia chi: ");
                String address = sc.nextLine();

                System.out.println("------------");
                System.out.println("Ten: " + name);
                System.out.println("Tuoi: " + age);
                System.out.println("Que quan: " + hometown);
                System.out.println("Can nang: " + weight);
                System.out.println("Ki hoc: " + semester);
                System.out.println("Chuyen nganh: " + major);
                System.out.println("So nha: " + houseNumber);
                System.out.println("Xa: " + ward);
                System.out.println("Dia chi: " + address);
                break;
            }
            case 3: {
                System.out.println("3. Kiem tra hoc luc");
                System.out.println("Nhap diem toan: ");
                double math = Double.valueOf(sc.nextLine());
                System.out.println("Nhap diem li: ");
                double physic = Double.valueOf(sc.nextLine());
                System.out.println("Nhap diem hoa: ");
                double chemistry = Double.valueOf(sc.nextLine());
                double score = (math + physic + chemistry) / 3;

                System.out.println("------------");
                System.out.println("Diem trung binh: " + score);

                if (0 <= score && score <= 5) {
                    System.out.println("Hoc luc yeu");
                } else if (5 <= score && score <= 7) {
                    System.out.println("Hoc luc trung binh");
                } else if (7 <= score && score <= 8) {
                    System.out.println("Hoc luc kha");
                } else if (8 <= score && score <= 9) {
                    System.out.println("Hoc luc gioi");
                } else {
                    System.out.println("Hoc luc xuat sac");
                }
                break;
            }
            case 4: {
                System.out.println("4. Kiem tra so");
                System.out.println("Nhap so nguyen: ");
                int number = Integer.valueOf(sc.nextLine());
                if (number % 2 != 0) {
                    if (number % 3 == 0) {
                        System.out.println("Day la so le va chia het cho 3");
                    } else {
                        System.out.println("Day la so le khong chia het cho"
                                + " 3");
                    }
                } else {
                    System.out.println("Day la so chan");
                }
                break;
            }
            case 5: {
                System.out.println("5. Tinh tong");
                System.out.println("Nhap so: ");
                int number = Integer.valueOf(sc.nextLine());
                int sum = (1 + number) * number / 2;

                System.out.println("-----------");
                System.out.println("Tong tu 0 - " + number + " la: " + sum);
                break;
            }
            case 6: {
                System.out.println("6. Tinh tich");
                System.out.println("Nhap so: ");
                int number = Integer.valueOf(sc.nextLine());
                long multiplication = 1;
                for (int i = 1; i <= number; i++) {
                    multiplication *= i;
                }

                System.out.println("----------");
                System.out.println("Tich tu 1 - " + number + " la: "
                        + multiplication);
                break;
            }
            case 7: {
                System.out.println("7. Tinh tong le");
                System.out.println("Nhap so: ");
                int number = Integer.valueOf(sc.nextLine());
                int sum = 0;
                for (int i = 0; i <= number; i++) {
                    if (i % 2 != 0) {
                        sum += i;
                    }
                }

                System.out.println("---------");
                System.out.println("Tong cac so le tu 0 - " + number + " la: "
                        + sum);
                break;
            }
            case 8: {
                System.out.println("8. Thoat");
                break;
            }
            default: {
                System.out.println("Khong co chuong trinh nay");
                break;
            }
        }
    }
}
