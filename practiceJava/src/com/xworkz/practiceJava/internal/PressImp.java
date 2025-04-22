package com.xworkz.practiceJava.internal;

public class PressImp implements Press {

    public PressImp() {
        System.out.println("no arg constructer");
    }

    @Override
    public void enter() {
        System.out.println("entering the key");
    }
}
