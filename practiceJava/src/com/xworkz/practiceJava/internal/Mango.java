package com.xworkz.practiceJava.internal;

public class Mango {
    Sugar sugar;

    public Mango(Sugar sugar) {
        System.out.println("Parameterized Constructer in Mango");
        this.sugar = sugar;
    }

    public void execute() {
        if(sugar!=null) {
            sugar.sugarPlant();
        } else {
            System.out.println("Null pointer exception");
        }
    }
}
