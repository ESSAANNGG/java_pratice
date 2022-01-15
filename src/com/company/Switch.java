package com.company;

public class Switch {
    public static void main(String[] args){
        int n = 3;

        switch (n){
        case 1:
            System.out.println("first case");
            break;
        case 2:
            System.out.println("second case");
        case 3:
            System.out.println("third case");
            break;
        default:
            System.out.println("default case");
        }
        System.out.println("자바연습하기");
    }
}
