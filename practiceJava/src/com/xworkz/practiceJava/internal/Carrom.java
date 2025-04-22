package com.xworkz.practiceJava.internal;

public class Carrom {
    Wood wood;

    public Carrom(Wood wood) {
        System.out.println("parameterized constructer");
        this.wood = wood;
    }
    public void execute() {
        if(wood!=null) {
            wood.type();
        } else {
            System.out.println("Null pointer exception");
        }
    }
}
