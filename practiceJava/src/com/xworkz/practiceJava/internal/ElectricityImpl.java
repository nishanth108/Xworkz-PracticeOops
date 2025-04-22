package com.xworkz.practiceJava.internal;

public class ElectricityImpl implements Electricity{
    public ElectricityImpl() {
        System.out.println("no arg constructer of Electricity");
    }

    @Override
    public void voltage() {
        System.out.println("Implementing Voltage");
    }
}
