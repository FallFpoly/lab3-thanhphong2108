/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lab3;

/**
 *
 * @author ICT
 */
import java.util.Scanner;

public class bai4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập số sinh viên: ");
        int n = sc.nextInt();
        sc.nextLine(); // bỏ dòng trống

        String[] hoTen = new String[n];
        double[] diem = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nSinh viên thứ " + (i + 1) + ":");
            System.out.print("Họ tên: ");
            hoTen[i] = sc.nextLine();
            System.out.print("Điểm: ");
            diem[i] = sc.nextDouble();
            sc.nextLine();
        }

        // Xuất thông tin + học lực
        System.out.println("\n=== DANH SÁCH SINH VIÊN ===");
        for (int i = 0; i < n; i++) {
            System.out.printf("%-20s Điểm: %-5.2f Học lực: %s\n", hoTen[i], diem[i], xepLoai(diem[i]));
        }

        // Sắp xếp tăng dần theo điểm (thuật toán nổi bọt)
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (diem[i] > diem[j]) {
                    double tmpD = diem[i];
                    diem[i] = diem[j];
                    diem[j] = tmpD;

                    String tmpT = hoTen[i];
                    hoTen[i] = hoTen[j];
                    hoTen[j] = tmpT;
                }
            }
        }

        System.out.println("\n=== DANH SÁCH SAU KHI SẮP XẾP TĂNG DẦN ===");
        for (int i = 0; i < n; i++) {
            System.out.printf("%-20s Điểm: %-5.2f Học lực: %s\n", hoTen[i], diem[i], xepLoai(diem[i]));
        }
    }

    public static String xepLoai(double diem) {
        if (diem < 5) return "Yếu";
        else if (diem < 6.5) return "Trung bình";
        else if (diem < 7.5) return "Khá";
        else if (diem < 9) return "Giỏi";
        else return "Xuất sắc";
    }
}
