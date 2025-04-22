package com.xworkz.practiceJava.internal;

public class ArchitectureImpl implements Architecture {
    public ArchitectureImpl() {
        System.out.println("no arg constructor");
    }

    @Override
    public void mvc() {
        System.out.println("Implementing the Mvc Architecture");
    }
}
