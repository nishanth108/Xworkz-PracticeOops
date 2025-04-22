package com.xworkz.practiceJava.internal;

public class CreamImpl implements Cream {
    public CreamImpl() {
        System.out.println("Parameterized construtor");
    }

    @Override
    public void price() {
        System.out.println("Running price in Cream");
    }
}
