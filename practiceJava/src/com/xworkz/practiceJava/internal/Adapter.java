package com.xworkz.practiceJava.internal;

public class Adapter {
    private Transistor transistor;

    public Adapter(Transistor transistor) {
        System.out.println("parameterized constructor");
        this.transistor = transistor;
    }

    public void execute() {
        if(this.transistor!=null) {
            this.transistor.price();
        } else {
            System.out.println("Null pointer exception");
        }
    }

}
