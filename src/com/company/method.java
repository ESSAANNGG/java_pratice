package com.company;

public class method {

    public static void main(String[] args){
        System.out.println("프로그램의 시작");
        hiEveryone(12);
        hiEveryone(13);
        System.out.println("끝");
    }

    public static void hiEveryone(int age){
        System.out.println("제 나이는 " + age + "입니다");
    }
}