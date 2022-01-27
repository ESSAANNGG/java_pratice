package com.powerjava;

public class doubleFor {
    public static void main(String[] args) {
        for (int y = 0; y < 5; y++) {
            for (int x = 5; x > 0; x--) {
                if (y < x) {
                    System.out.println(" ");
                } else {
                    System.out.println("*");
                }
            }
//            System.out.println("");
        }
    }
}