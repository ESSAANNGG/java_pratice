package com.powerjava;

import java.util.Scanner;

public class Pay {
    public static void main(String[] args){
        final int RATE = 5000;
        int pay;
        Scanner input = new Scanner(System.in);

        System.out.println("시간을 입력하세요");
        int time = input.nextInt();

        if(time > 8){
            pay = RATE * 8 + (int) (1.5 * RATE * (time -8));
        } else{
            pay = RATE * time;
        }
        System.out.println("임금은" + pay );
    }
}
