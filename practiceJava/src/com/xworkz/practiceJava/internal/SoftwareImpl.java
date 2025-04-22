package com.xworkz.practiceJava.internal;

public class SoftwareImpl implements Software {
    public SoftwareImpl() {
        System.out.println("no arg constructor ");
    }

    @Override
    public void deploy() {
        System.out.println("Deploying software");
    }
}
