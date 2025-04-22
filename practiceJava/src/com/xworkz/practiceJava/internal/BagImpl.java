package com.xworkz.practiceJava.internal;

public class BagImpl implements Bag {
    public BagImpl() {
        System.out.println("No arg constructer");
    }

    @Override
    public void quality(){
        System.out.println("the quality is good");
    }
}
