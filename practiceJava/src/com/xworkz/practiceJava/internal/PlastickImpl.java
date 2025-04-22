package com.xworkz.practiceJava.internal;

public class PlastickImpl implements Plastick {
    @Override
    public void color() {
        System.out.println("Its of yellow color");
    }

    public PlastickImpl() {
        System.out.println("No arg constructor ");
    }
}
