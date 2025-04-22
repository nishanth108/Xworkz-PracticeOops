package com.xworkz.practiceJava.internal;

public class MobileImpl implements Mobile {
    public MobileImpl() {
        System.out.println("No arg constructor in Mobile Imp class");
    }

    @Override
    public void playMusic() {
        System.out.println("Playing music in the mobile class");
    }
}
