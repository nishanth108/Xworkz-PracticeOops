package com.xworkz.practiceJava.internal;

public class MilkImpl implements Milk{
    public MilkImpl() {
        System.out.println("Running no arg constructer");
    }

    @Override
    public void useMilk() {
        System.out.println("Implementing Milk");
    }
}
