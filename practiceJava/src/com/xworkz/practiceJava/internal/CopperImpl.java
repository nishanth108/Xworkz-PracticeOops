package com.xworkz.practiceJava.internal;

public class CopperImpl implements Copper{
    public CopperImpl() {
        System.out.println("no arg constructer of copper");
    }

    @Override
    public void quality() {
        System.out.println("the quality is good");
    }
}
