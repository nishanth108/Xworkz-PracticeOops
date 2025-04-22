package com.xworkz.practiceJava.internal;

public class ModelImpl implements Model{
    public ModelImpl() {
        System.out.println("Running no arg constractor");
    }

    @Override
    public void name() {
        System.out.println("Yolo v model");
    }
}
