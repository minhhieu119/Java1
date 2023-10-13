/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BTVN_Buoi8;

import java.util.Scanner;

/**
 *
 * @author MSII
 */
public class BTVN_Buoi8 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int menu;

        do {
            System.out.println("Moi chon: ");
            menu = Integer.valueOf(sc.nextLine());
            switch (menu) {
                case 1: {
                    System.out.println("1. Kiem tra so nguyen duong");
                    System.out.println("Nhap so: ");
                    double number = Double.valueOf(sc.nextLine());

                    if (number > 0 && number == (int) number) {
                        System.out.println("Day la so nguyen duong");
                    } else {
                        System.out.println("Day khong la so nguyen duong");
                    }
                    break;
                }
                case 2: {
                    System.out.println("2. Kiem tra so chan le");
                    System.out.println("Nhap so nguyen: ");
                    int number = Integer.valueOf(sc.nextLine());
                    if (number % 2 == 0) {
                        System.out.println("Day la so chan");
                    } else {
                        System.out.println("Day la so le");
                    }
                    break;
                }
                case 3: {
                    System.out.println("3. Tinh tong, hieu, tich, thuong");
                    System.out.println("Nhap so thu 1: ");
                    int number1 = Integer.valueOf(sc.nextLine());
                    System.out.println("Nhap so thu 2: ");
                    int number2 = Integer.valueOf(sc.nextLine());

                    int addition = number1 + number2;
                    int subtraction = number1 - number2;
                    int multiplication = number1 * number2;
                    double division = (double) number1 / (double) number2;
                    System.out.println("Tong 2 so: " + addition);
                    System.out.println("Hieu 2 so: " + subtraction);
                    System.out.println("Tich 2 so: " + multiplication);
                    System.out.println("Thuong 2 so: " + division);
                    break;
                }
                case 4: {
                    System.out.println("4. Nam sinh");
                    System.out.println("Nhap tuoi: ");
                    int age = Integer.valueOf(sc.nextLine());
                    int birthYear = 2023 - age;
                    System.out.println("----------");
                    System.out.println("Nam sinh: " + birthYear);
                    break;
                }
                case 5: {
                    System.out.println("5. Kiem tra thang");

                    int month;
                    do {
                        System.out.println("Nhap thang: ");
                        month = Integer.valueOf(sc.nextLine());
                    } while (month < 1 || month > 12);

                    if (month == 3 || month == 1 || month == 5 || month == 7
                            || month == 8 || month == 10 || month == 12) {
                        System.out.println("Thang " + month + " co 31 ngay");
                    } else if (month == 2) {
                        System.out.println("Thang 2 co 28 ngay");
                    } else {
                        System.out.println("Thang " + month + " co 30 ngay");
                    }
                    break;
                }
                case 6: {
                    System.out.println("6. Trung thu");
                    System.out.println("Nhap tuoi: ");
                    int age = Integer.valueOf(sc.nextLine());
                    if (age < 16) {
                        System.out.println("Ban duoc nhan qua trung thu");
                    } else {
                        System.out.println("Ban khong duoc nhan qua trung "
                                + "thu");
                    }
                    break;
                }
                case 7: {
                    System.out.println("7. So lon nhat");
                    int arrNumber[] = new int[4];
                    for (int i = 0; i < 4; i++) {
                        System.out.println("Nhap so thu " + i + 1 + ": ");
                        arrNumber[i] = Integer.valueOf(sc.nextLine());
                    }
                    int max = arrNumber[0];
                    for (int i = 1; i < 4; i++) {
                        if (max < arrNumber[i]) {
                            max = arrNumber[i];
                        }
                    }
                    System.out.println("So lon nhat trong 4 so la: " + max);
                    break;
                }
                case 8: {
                    System.out.println("8. Hoa hong");
                    System.out.println("Nhap doanh so ban: ");
                    long money = Long.valueOf(sc.nextLine());
                    if (money <= 100000000) {
                        System.out.println("Ban nhan duoc hoa hong la 5%: "
                                + money * 5 / 100);
                    } else if (money <= 300000000) {
                        System.out.println("Ban nhan duoc hoa hong la 10%: "
                                + money * 10 / 100);
                    } else {
                        System.out.println("Ban nhan duoc hoa hong la 20%: "
                                + money * 20 / 100);
                    }
                    break;
                }
                case 9: {
                    System.out.println("9. Phuong trinh bac 2 : ax^2 + bx +c "
                            + "= 0");
                    System.out.println("Nhap thua so a: ");
                    double numberA = Double.valueOf(sc.nextLine());
                    System.out.println("Nhap thua so b: ");
                    double numberB = Double.valueOf(sc.nextLine());
                    System.out.println("Nhap he so c: ");
                    double numberC = Double.valueOf(sc.nextLine());
                    double delta, x, x1, x2;
                    delta = Math.pow(numberB, 2) - (4 * numberA * numberC);
                    System.out.println("delta = " + delta);
                    x = (-numberB) / 2 * numberA;
                    x1 = ((-numberB) + Math.sqrt(delta)) / (2 * numberA);
                    x2 = ((-numberB) - Math.sqrt(delta)) / (2 * numberA);
                    if (numberA == 0) {
                        System.out.println("Phuong trinh co 1 nghiem x = "
                                + (-numberC) / numberB);

                    } else {
                        if (delta < 0) {
                            System.out.println("Phuong trinh vo nghiem");
                        } else if (delta == 0) {
                            System.out.println("Phuong trinh co nghiem kep "
                                    + "x1 = x2 = " + x);
                        } else {
                            System.out.println("Phuong trinh co 2 nghiem: "
                                    + "x1 = " + x1 + " x2 = " + x2);
                        }
                    }

                    break;
                }
                case 10: {
                    System.out.println("10. Thong tin ca nhan");
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
                case 11: {
                    System.out.println("11. Tong tu 0 - n");
                    System.out.println("Nhap so nguyen duong n: ");
                    int n = Integer.valueOf(sc.nextLine());
                    int sum = 0;
                    for (int i = 0; i < n + 1; i++) {
                        sum += i;
                    }
                    System.out.println("------------");
                    System.out.println("Tong cac so tu 0 - " + n + " la: " + sum);
                    break;
                }
                case 12: {
                    System.out.println("12. Tich so le tu 1 - n");
                    System.out.println("Nhap so nguyen duong n: ");
                    int n = Integer.valueOf(sc.nextLine());
                    int product = 1;
                    for (int i = 1; i < n + 1; i++) {
                        if (i % 2 != 0) {
                            product *= i;
                        }
                    }
                    System.out.println("------------");
                    System.out.println("Tich cac so le tu 1 - " + n + " la: "
                            + product);
                    break;
                }
                case 13: {
                    System.out.println("13. Mang tinh tong");
                    System.out.println("Nhap so phan tu mang: ");
                    int n = Integer.valueOf(sc.nextLine());
                    int arr[] = new int[n];
                    System.out.println("Nhap mang");
                    for (int i = 0; i < n; i++) {
                        arr[i] = Integer.valueOf(sc.nextLine());
                    }

                    System.out.println("--------------");
                    System.out.println("In mang");
                    for (int i = 0; i < n; i++) {
                        System.out.println(arr[i]);
                    }
                    int sum = 0;
                    for (int i = 0; i < n; i++) {
                        if (arr[i] % 5 == 0) {
                            sum += i;
                        }
                    }
                    System.out.println("Tong vi tri cac phan tu chia het "
                            + "cho 5 la: " + sum);
                    break;
                }
                case 14: {
                    System.out.println("14. Mang tich so chan o vi tri le");
                    System.out.println("Nhap so phan tu mang: ");
                    int n = Integer.valueOf(sc.nextLine());
                    int arr[] = new int[n];
                    System.out.println("Nhap mang");
                    for (int i = 0; i < n; i++) {
                        arr[i] = Integer.valueOf(sc.nextLine());
                    }
                    int product = 1;
                    for (int i = 0; i < n; i++) {
                        if (i % 2 != 0 && arr[i] % 2 == 0) {
                            product *= arr[i];
                        }
                    }
                    System.out.println("------------");
                    System.out.println("Tich cac so chan o vi tri le: "
                            + product);
                    break;
                }
                case 15: {
                    System.out.println("15. So le dau tien trong mang");
                    System.out.println("Nhap so phan tu mang: ");
                    int n = Integer.valueOf(sc.nextLine());
                    int arr[] = new int[n];
                    System.out.println("Nhap mang");
                    for (int i = 0; i < n; i++) {
                        arr[i] = Integer.valueOf(sc.nextLine());
                    }
                    for (int i = 0; i < n; i++) {
                        if (arr[i] % 2 != 0) {
                            System.out.println("Vi tri so le dau tien trong "
                                    + "mang la: " + i);
                            break;
                        }
                    }
                    break;
                }
                case 16: {
                    System.out.println("16. So le cuoi cung trong mang");
                    System.out.println("Nhap so phan tu mang: ");
                    int n = Integer.valueOf(sc.nextLine());
                    int arr[] = new int[n];
                    System.out.println("Nhap mang");
                    for (int i = 0; i < n; i++) {
                        arr[i] = Integer.valueOf(sc.nextLine());
                    }
                    for (int i = n - 1; i >= 0; i--) {
                        if (arr[i] % 2 != 0) {
                            System.out.println("Vi tri so le cuoi cung trong"
                                    + "mang la: " + i);
                            break;
                        }
                    }
                    break;
                }
                case 17: {
                    System.out.println("17. Thoat");
                    break;
                }
                default: {
                    System.out.println("Khong co chuc nang nay");
                }
            }
        } while (menu != 17);
    }
}
