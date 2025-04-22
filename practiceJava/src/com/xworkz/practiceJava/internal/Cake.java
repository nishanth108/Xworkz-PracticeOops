package com.xworkz.practiceJava.internal;

public class Cake {
    private Cream cream;

    public Cake(Cream cream) {
        System.out.println("Running Parametarized construtor");
        this.cream = cream;
    }

    public void execute() {
        if(this.cream!=null) {
            this.cream.price();
        } else {
            System.out.println("Null pointer exception");
        }
    }
}
