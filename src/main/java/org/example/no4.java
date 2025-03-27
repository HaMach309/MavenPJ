package org.example;
import java.util.Scanner;

public class no4 {
    public static void main(String[] args) {
        String nameUser,birthDay;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập họ và tên: ");
        nameUser = scanner.nextLine();
        System.out.print("Nhập ngày tháng năm sinh: ");
        birthDay = scanner.nextLine();
        System.out.println("Họ và tên là: " + nameUser);
        System.out.println("Ngày tháng năm sinh là: " + birthDay);

    }

}
