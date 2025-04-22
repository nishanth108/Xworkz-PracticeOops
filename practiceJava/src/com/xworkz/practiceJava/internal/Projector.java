package com.xworkz.practiceJava.internal;

public class Projector {
    Electricity electricity;

    public Projector(Electricity electricity) {
        System.out.println("Parameterized Constructer");
        this.electricity = electricity;
    }

    public void execute() {
        if(electricity!=null) {
            electricity.voltage();
        } else {
            System.out.println("Null pointer exception");
        }
    }
}
