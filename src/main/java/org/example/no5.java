package org.example;

import java.util.Scanner;

public class no5 {
    public static void main(String[] args) {
        int dai,rong;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập chiều dài: ");
        dai = scanner.nextInt();
        System.out.print("Nhập chiều rộng: ");
        rong = scanner.nextInt();
        System.out.println("Diện tích hình chữ nhật là: "+(dai*rong)
            +"\nChu vi hình chữ nhật là: "+((dai+rong)*2)
        );
    }
}
