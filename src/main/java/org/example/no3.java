package org.example;
import java.util.Scanner;

public class no3 {
    public static void main(String[] args) {
        double num;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số thực: ");
        num = scanner.nextDouble();
        int floorNum = (int) Math.floor(num);
        int ceilNum = (int) Math.ceil(num);

        System.out.println("Số thực ban đầu: " + num);
        System.out.println("Số nguyên sau khi làm tròn xuống: " + floorNum);
        System.out.println("Số nguyên sau khi làm tròn lên: " + ceilNum);

    }

}
