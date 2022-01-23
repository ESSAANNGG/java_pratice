package com.powerjava;

import java.util.Scanner;

public class Salary {
    public static void main(String[] args){

        int salary;
        int deposit;

        Scanner input = new Scanner(System.in);

        System.out.println("월급을 입력하세요.");
        salary = input.nextInt();

        deposit = salary * 12 * 10;

        System.out.println("10년 저축액은 : " + deposit);
    }
}
