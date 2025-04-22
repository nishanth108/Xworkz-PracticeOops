package com.xworkz.practiceJava.internal;

public class GasImpl implements Gas {
    public GasImpl() {
        System.out.println("no arg constractor");
    }

    @Override
    public void fill() {
        System.out.println("Filling gas");
    }
}
