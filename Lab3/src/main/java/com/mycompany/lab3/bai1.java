/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lab3;

/**
 *
 * @author ICT
 */
import java.util.Scanner;

public class bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số nguyên N: ");
        int N = sc.nextInt();

        boolean ok = true;
        if (N < 2) ok = false;
        else {
            for (int i = 2; i <= Math.sqrt(N); i++) {
                if (N % i == 0) {
                    ok = false;
                    break;
                }
            }
        }

        if (ok)
            System.out.println(N + " là số nguyên tố.");
        else
            System.out.println(N + " không phải là số nguyên tố.");
    }
}

