/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lab3;

/**
 *
 * @author ICT
 */
import java.util.Arrays;
import java.util.Scanner;

public class bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập số phần tử của mảng: ");
        int n = sc.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("a[" + i + "] = ");
            a[i] = sc.nextInt();
        }

        Arrays.sort(a);
        System.out.println("\nMảng sau khi sắp xếp:");
        for (int x : a) {
            System.out.print(x + " ");
        }

        int min = a[0];
        System.out.println("\nGiá trị nhỏ nhất: " + min);

        int tong = 0, dem = 0;
        for (int x : a) {
            if (x % 3 == 0) {
                tong += x;
                dem++;
            }
        }

        if (dem > 0) {
            double tb = (double) tong / dem;
            System.out.printf("Trung bình cộng các phần tử chia hết cho 3: %.2f\n", tb);
        } else {
            System.out.println("Không có phần tử nào chia hết cho 3.");
        }
    }
}
