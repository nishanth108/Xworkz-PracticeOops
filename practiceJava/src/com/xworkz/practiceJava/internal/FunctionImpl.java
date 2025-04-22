package com.xworkz.practiceJava.internal;

public class FunctionImpl implements Function{
    public FunctionImpl() {
        System.out.println("No arg constructor");
    }

    @Override
    public void jump() {
        System.out.println("Jump high.....");
    }

}
