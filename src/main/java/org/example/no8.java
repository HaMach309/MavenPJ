package org.example;

import java.util.Scanner;

public class no8 {
    public static void main(String[] args) {
        int n;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số n: ");
        n = scanner.nextInt();
        long s= 0;
        for (int i= 1; i<=n; i++){
            s = s+i;
        }
        System.out.println("Tổng từ các số từ 1 đến n là: "+s);

    }
}
