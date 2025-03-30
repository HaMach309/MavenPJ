package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class no11 {

    public static void main(String[] args) {
        int[] a;
        int n;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số lượng phần tử của màng: ");
        n = scanner.nextInt();
        a = new int[n];
        for (int i = 0; i<n; i++){
            System.out.print("Nhập phần tử thứ "+ (i+1)+" của mảng:" );
            a[i] = scanner.nextInt();
        }
        int max = Arrays.stream(a).max().getAsInt();
        System.out.println("Phần tử lớn nhất trong mảng là: " + max);

    }
}
