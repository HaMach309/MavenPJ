package org.example;

import java.util.Scanner;

public class no10 {

    public static void main(String[] args) {
        int h;
        int t;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số giờ làm: ");
        h = scanner.nextInt();
        System.out.print("Nhập lương mỗi giờ: ");
        t = scanner.nextInt();
        double s = t * Math.min(h, 40) + Math.max(0, (h - 40)) * 1.5 * t;
        System.out.printf("Tổng tiền lương là: %.2f", s);

    }
}
