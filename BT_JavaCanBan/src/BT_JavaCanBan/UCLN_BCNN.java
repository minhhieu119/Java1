/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BT_JavaCanBan;

import java.util.Scanner;

/**
 *
 * @author MSII
 */
public class UCLN_BCNN {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.valueOf(sc.nextLine());
        int m = Integer.valueOf(sc.nextLine());
        System.out.println("Uoc chung lon nhat la: " + ucln(n, m));
        System.out.println("Boi so chung no nhat la: " + bcnn(n, m));
    }

    private static String ucln(int n, int m) {
        while (n != m) {
            if (n > m) {
                n -= m;
            } else {
                m -= n;
            }
        }
        return Integer.toString(m);
    }

    private static String bcnn(int n, int m) {
        int usc = Integer.valueOf(ucln(n, m));
        return Integer.toString((m * n) / usc);
    }

}
