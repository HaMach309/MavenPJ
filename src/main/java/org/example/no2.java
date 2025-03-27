package org.example;

import java.util.Scanner;

public class no2 {
    public static void main(String[] args) {
        int a,b;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số nguyên a: ");
        a = scanner.nextInt();
        System.out.print("Nhập số nguyên b: ");
        b = scanner.nextInt();
        System.out.println("Tổng của a và b là: "+(a+b)
            +"\nHiệu của a và b là: "+Math.abs(a-b)
            +"\nTích của a và b là: "+(a*b)
            +"\nThương của a và b là: "+(a/b)
            + "\nChia lấy dư của a và b là: " +(a%b)
        );
    }
}
