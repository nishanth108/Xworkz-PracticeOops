package com.xworkz.practiceJava.internal;

public class BoyImpl implements Boys{
    public BoyImpl() {
        System.out.println("no arg constuter of BoyImpl");
    }

    @Override
    public void emotions() {
        System.out.println("Developing emotions");
    }
}
