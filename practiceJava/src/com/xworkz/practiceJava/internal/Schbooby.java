package com.xworkz.practiceJava.internal;

public class Schbooby {
    private Bag bag;

    public Schbooby(Bag bag) {
        System.out.println("Running Schooby Constructer");
        this.bag = bag;
    }

    public void execute() {
        if(bag!=null) {
            bag.quality();
        } else {
            System.out.println("Null pointer exception");
        }
    }
}
