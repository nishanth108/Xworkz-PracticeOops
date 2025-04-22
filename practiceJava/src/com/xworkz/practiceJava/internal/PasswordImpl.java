package com.xworkz.practiceJava.internal;

public class PasswordImpl implements Password {
    public PasswordImpl() {
        System.out.println("No arg constructer");
    }

    @Override
    public void unlock() {
        System.out.println("Unclocking the Mobile");
    }
}
