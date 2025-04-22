package com.xworkz.practiceJava.internal;

public class Paper {
    private Bamboo bamboo;

    public Paper(Bamboo bamboo) {
        System.out.println("parameterized constructor");
        this.bamboo = bamboo;
    }
    public void execute() {
        if(this.bamboo!=null) {
            this.bamboo.use();
        } else {
            System.out.println("Null pointer exception");
        }
    }

}
