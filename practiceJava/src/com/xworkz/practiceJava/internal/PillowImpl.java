package com.xworkz.practiceJava.internal;

public class PillowImpl implements Pillow{
    public PillowImpl() {
        System.out.println("In the no arg constructor");
    }

    @Override
    public void price() {
        System.out.println("The price of rice is 6k");
    }
}
