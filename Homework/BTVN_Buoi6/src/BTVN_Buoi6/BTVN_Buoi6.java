/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BTVN_Buoi6;

import java.util.Scanner;

/**
 *
 * @author MSII
 */
public class BTVN_Buoi6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int menu;
        do {
            System.out.println("Moi chon chuc nang: ");
            menu = Integer.valueOf(sc.nextLine());

            switch (menu) {
                case 1: {
                    System.out.println("1. Tinh tong, tich, thuong cua 2 so");
                    System.out.println("Nhap so thu nhat: ");
                    int number1 = Integer.valueOf(sc.nextLine());
                    System.out.println("Nhap so thu hai: ");
                    int number2 = Integer.valueOf(sc.nextLine());
                    int sum = number1 + number2;
                    int product = number1 * number2;
                    double quotient = (double) number1 / (double) number2;

                    System.out.println("----------");
                    System.out.println("Tong cua 2 so: " + sum);
                    System.out.println("Tich cua 2 so: " + product);
                    System.out.println("Thuong cua 2 so: " + quotient);
                    break;
                }
                case 2: {
                    System.out.println("2. Thong tin ca nhan");
                    System.out.println("Nhap ten: ");
                    String name = sc.nextLine();
                    System.out.println("Nhap tuoi: ");
                    int age = Integer.valueOf(sc.nextLine());
                    System.out.println("Nhap dia chi: ");
                    String address = sc.nextLine();
                    System.out.println("Nhap ki hoc: ");
                    int semester = Integer.valueOf(sc.nextLine());

                    System.out.println("------------");
                    System.out.println("Ten: " + name);
                    System.out.println("Tuoi: " + age);
                    System.out.println("Dia chi: " + address);
                    System.out.println("Ki hoc: " + semester);
                    break;
                }
                case 3: {
                    System.out.println("3. Tong cac so tu 0 - n");
                    System.out.println("Nhap so nguyen: ");
                    int number = Integer.valueOf(sc.nextLine());
                    int sum = 0;
                    for (int i = 0; i < number + 1; i++) {
                        sum += i;
                    }
                    System.out.println("-------------");
                    System.out.println("Tong cac so tu 0 - " + number + " la: "
                            + sum);
                    break;
                }
                case 4: {
                    System.out.println("4. Tich cac so le tu 1 - n");
                    System.out.println("Nhap so nguyen: ");
                    int number = Integer.valueOf(sc.nextLine());
                    int product = 1;
                    for (int i = 0; i < number + 1; i++) {
                        if (i % 2 != 0) {
                            product *= i;
                        }
                    }
                    System.out.println("------------");
                    System.out.println("Tich cac so le tu 1 - " + number + " la: "
                            + product);
                    break;
                }
                case 5: {
                    System.out.println("5. Mang");
                    System.out.println("Nhap so luong phan tu mang: ");
                    int quantity = Integer.valueOf(sc.nextLine());
                    int arr[] = new int[quantity];
                    System.out.println("Nhap gia tri cho mang:");
                    for (int i = 0; i < quantity; i++) {
                        arr[i] = Integer.valueOf(sc.nextLine());
                    }

                    System.out.println("In mang theo chieu nguoc lai:");
                    for (int i = quantity - 1; i > -1; i--) {
                        System.out.println(arr[i]);
                    }
                    break;
                }
                case 6: {
                    System.out.println("6. Tich cac so chan o vi tri le");
                    System.out.println("Nhap so phan tu cua mang: ");
                    int quantity = Integer.valueOf(sc.nextLine());
                    int arr[] = new int[quantity];
                    for (int i = 0; i < quantity; i++) {
                        arr[i] = Integer.valueOf(sc.nextLine());
                    }
                    int product = 1;
                    for (int i = 0; i < quantity; i++) {
                        if (i % 2 != 0 && arr[i] % 2 == 0) {
                            product *= arr[i];
                        }
                    }
                    System.out.println("Tich cac so chan o vi tri le la: "
                            + product);
                    break;
                }
                case 7: {
                    System.out.println("7. Vi tri so le dau tien trong mang");
                    System.out.println("Nhap so phan tu cua mang: ");
                    int quantity = Integer.valueOf(sc.nextLine());
                    int arr[] = new int[quantity];
                    for (int i = 0; i < quantity; i++) {
                        arr[i] = Integer.valueOf(sc.nextLine());
                    }
                    for (int i = 0; i < quantity; i++) {
                        if (arr[i] % 2 != 0) {
                            System.out.println("Vi tri so le dau tien trong "
                                    + "mang la: vi tri " + i);
                            break;
                        }
                    }
                    break;
                }
                case 8: {
                    System.out.println("8. Liet ke cac vi tri so co gia tri"
                            + " lon nhat");
                    System.out.println("Nhap so phan tu cua mang: ");
                    int quantity = Integer.valueOf(sc.nextLine());
                    int arr[] = new int[quantity];
                    for (int i = 0; i < quantity; i++) {
                        arr[i] = Integer.valueOf(sc.nextLine());
                    }
                    int max = arr[0];
                    for (int i = 1; i < quantity; i++) {
                        if (max < arr[i]) {
                            max = arr[i];
                        }
                    }
                    System.out.println("Cac vi tri so co gia tri lon nhat "
                            + "trong mang la: ");
                    for (int i = 0; i < quantity; i++) {
                        if (arr[i] == max) {
                            System.out.println(i);
                        }
                    }
                    break;
                }
                case 9: {
                    System.out.println("9. Vi tri so le cuoi cung trong "
                            + "mang");
                    System.out.println("Nhap so phan tu cua mang: ");
                    int quantity = Integer.valueOf(sc.nextLine());
                    int arr[] = new int[quantity];
                    for (int i = 0; i < quantity; i++) {
                        arr[i] = Integer.valueOf(sc.nextLine());
                    }
                    for (int i = quantity - 1; i > -1; i--) {
                        if (arr[i] % 2 != 0) {
                            System.out.println("Vi tri so le cuoi cung trong "
                                    + "mang la: " + i);
                            break;
                        }
                    }
                    break;
                }
                case 10: {
                    System.out.println("10. Tong cua cac vi tri co gia tri"
                            + " nho nhat trong mang");
                    System.out.println("Nhap so phan tu cua mang: ");
                    int quantity = Integer.valueOf(sc.nextLine());
                    int arr[] = new int[quantity];
                    for (int i = 0; i < quantity; i++) {
                        arr[i] = Integer.valueOf(sc.nextLine());
                    }
                    int min = arr[0];
                    for (int i = 1; i < quantity; i++) {
                        if (min > arr[i]) {
                            min = arr[i];
                        }
                    }
                    int sum = 0;
                    for (int i = 0; i < quantity; i++) {
                        if (min == arr[i]) {
                            sum += i;
                        }
                    }
                    System.out.println("Tong cac vi tri co gia tri nho nhat "
                            + "trong mang: " + sum);
                    break;
                }
                case 0: {
                    System.out.println("0. Thoat");
                    System.out.println("Tam biet !");
                    break;
                }
                default: {
                    System.out.println("Khong co chuong trinh nay!");
                }
            }
        } while (menu != 0);
    }
}
