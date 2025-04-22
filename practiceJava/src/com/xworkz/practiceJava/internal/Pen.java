package com.xworkz.practiceJava.internal;

public class Pen {
    private Link link;

    public Pen(Link link) {
        System.out.println("parameterized Constructor");
        this.link = link;
    }

    public void execute() {
        if(this.link!=null) {
            this.link.use();
        } else {
            System.out.println("Null pointer exception");
        }
    }

}
