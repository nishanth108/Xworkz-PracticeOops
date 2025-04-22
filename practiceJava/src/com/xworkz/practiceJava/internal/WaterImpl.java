package com.xworkz.practiceJava.internal;

public class WaterImpl implements Water{
    public WaterImpl() {
        System.out.println("Running water Constructer");
    }


    @Override
    public void qality() {
        System.out.println("the quality of the water is good");
    }
}
