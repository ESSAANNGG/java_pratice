package com.powerjava;

import java.util.Scanner;

public class Box {
    public static void main(String[] args){
        double w;
        double h;
        double area;
        double perimeter;

        Scanner input = new Scanner(System.in);

        System.out.println("가로 길이를 입력하세요");
        w = input.nextInt();
        System.out.println("세로 길이를 입력하세요");
        h = input.nextInt();

        System.out.println("넓이는 : " + w * h);
        System.out.println("둘레는 : " + 2*(w + h));
    }
}
