package org.example;

import java.util.Scanner;

public class no6 {
    public static void main(String[] args) {
        int c;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập nhiệt độ C: ");
        c = scanner.nextInt();
        System.out.printf("Nhiệt độ F tương ứng là: %.2f", (float)(c*9/5));
    }
}
