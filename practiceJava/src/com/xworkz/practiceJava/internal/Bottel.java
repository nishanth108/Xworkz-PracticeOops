package com.xworkz.practiceJava.internal;

public class Bottel {
    Water water;

    public Bottel(Water water) {
        System.out.println("parameterized constructor of water");
        this.water = water;
    }
    public void execute() {
        if(water!=null) {
            water.qality();
        } else {
            System.out.println("Null pointer exception");
        }
    }
}
