package com.xworkz.practiceJava.internal;

public class LaptopImpl implements Laptop{
    public LaptopImpl() {
        System.out.println("Running no arg Constructer in LaptopImpl");
    }
    @Override
    public void process() {
        System.out.println("Running Process in LaptopImpl");
    }
}
