package com.xworkz.practiceJava.internal;

public class WebImpl implements Web {

    public WebImpl() {
        System.out.println("no arg constructor");
    }

    @Override
    public void design() {
        System.out.println("Designing the Web");
    }
}
