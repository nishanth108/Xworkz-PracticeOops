package com.xworkz.practiceJava.internal;

public class Duke {
    Bike bike;

    public Duke(Bike bike) {
        System.out.println("parameterized construtor");
        this.bike = bike;
    }
    public void execute() {
        if(bike!=null) {
            bike.accelerate();
        } else {
            System.out.println("Null pointer exception");
        }
    }
}
