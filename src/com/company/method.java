package com.company;

public class method {

    public static void main(String[] args){
        int result;
        result = adder(4,5);
        System.out.println(result);
        System.out.println(square(3.5));
    }

//    public static void hiEveryone(int age){
//        System.out.println("제 나이는 " + age + "입니다");
//    }

    public static int adder(int num1, int num2){
        int addResult = num1 + num2;
        return addResult; // addResult의 값을 반환
    }

    public static double square(double num){
        return num * num;
    }
}
