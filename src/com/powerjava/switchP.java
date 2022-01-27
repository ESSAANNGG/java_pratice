package com.powerjava;

import java.util.Scanner;

public class switchP {
    public static void main(String[] args) {
        int number;

        Scanner input = new Scanner(System.in);
        System.out.println("숫자를 입력하세요.");
        number = input.nextInt();
        switch (number) {
            case 0:
                System.out.println("영 입력");
                break;
            case 1:
                System.out.println("일 입력");
                break;
            case 2:
                System.out.println("이 입력");
                break;
            case 3:
                System.out.println("삼 입력");
                break;
            default:
                System.out.println("케이스 없음");
                break;
        }
    }
}
