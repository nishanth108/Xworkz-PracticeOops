package com.xworkz.practiceJava.internal;

public class bikeImpl implements Bike{

    public bikeImpl() {
        System.out.println("No arg constructor");
    }

    @Override
    public void accelerate() {
        System.out.println("Accelrating");
    }
}
