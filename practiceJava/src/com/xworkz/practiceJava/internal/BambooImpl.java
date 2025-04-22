package com.xworkz.practiceJava.internal;

public class BambooImpl implements Bamboo {
    public BambooImpl() {
        System.out.println("no arg constractor");
    }

    @Override
    public void use() {
        System.out.println("Using Bamboo");
    }
}
