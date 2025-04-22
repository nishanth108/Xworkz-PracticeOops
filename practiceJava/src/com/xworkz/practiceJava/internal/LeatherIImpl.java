package com.xworkz.practiceJava.internal;

public class LeatherIImpl implements Leather{
    public LeatherIImpl() {
        System.out.println("no arg constructor");
    }

    @Override
    public void size() {
        System.out.println("The leather of large size");
    }
}
