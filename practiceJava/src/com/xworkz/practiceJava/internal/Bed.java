package com.xworkz.practiceJava.internal;

public class Bed {
    Pillow pillow;

    public Bed(Pillow pillow) {
        System.out.println("Parameterized Counstructer");
        this.pillow = pillow;
    }
    public void execute() {
        if(pillow!=null) {
            pillow.price();
        } else {
            System.out.println("Null pointer exception");
        }
    }
}
