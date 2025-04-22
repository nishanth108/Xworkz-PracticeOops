package com.xworkz.practiceJava.internal;

public class CarImpl implements Car {
    public CarImpl() {
        System.out.println("no arg constructer");
    }

    @Override
    public void drive() {
        System.out.println("Driving on ");
    }
}
