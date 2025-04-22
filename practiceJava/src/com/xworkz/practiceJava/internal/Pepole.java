package com.xworkz.practiceJava.internal;

public class Pepole {
    Mobile mobile;
    public Pepole(Mobile mobile) {
        System.out.println("Parameterized constructor");
        this.mobile=mobile;
    }
    public void execute() {
        if(mobile!=null) {
            mobile.playMusic();
        } else {
            System.out.println("Null pointer exception");
        }
    }
}
