package com.xworkz.practiceJava.internal;

public class Girl {
    Boys boys;

    public Girl(Boys boys) {
        System.out.println("Parameter constructer of Girl");
        this.boys = boys;
    }

    public void execute() {
        if(boys!=null) {
            boys.emotions();
        } else {
            System.out.println("Null pointer exception");
        }
    }
}
