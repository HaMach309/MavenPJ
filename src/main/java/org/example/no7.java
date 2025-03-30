package org.example;

import java.util.Scanner;

public class no7 {
    public static void main(String[] args) {
        int n;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số muốn kiểm tra: ");
        n = scanner.nextInt();
        if (n%2==1){
            System.out.printf(n+" là số lẻ");
        } else{
            System.out.printf(n+" là số chẵn");
        }
    }
}
