package com.xworkz.practiceJava.internal;

public class GlassImpl implements Glass{
    public GlassImpl() {
        System.out.println("no arg constractor");
    }

    @Override
    public void durability() {
        System.out.println("Comes with good durability");
    }
}
