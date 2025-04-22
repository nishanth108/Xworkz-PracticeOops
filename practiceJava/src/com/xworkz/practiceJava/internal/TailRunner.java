package com.xworkz.practiceJava.internal;

public class TailRunner implements Tail {
    @Override
    public void use() {
        System.out.println("Using tail Rnner");
    }

    public TailRunner() {
        System.out.println("No arg constrator");
    }
}
