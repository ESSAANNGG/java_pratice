package com.powerjava;

class Car {
    String Color;
    int speed;
    int gear;

    void print(){
        System.out.println(Color + speed + gear);
    }
}

public class CarTest {
    public static void main(String[] args){

        Car mycar = new Car();
        mycar.Color = "red";
        mycar.speed = 10;
        mycar.gear = 3;
        mycar.print();
    }
}
