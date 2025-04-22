package com.xworkz.practiceJava.internal;

public class ShoeImpl implements Shoe{

    public ShoeImpl() {
        System.out.println("No Argment Construtor");
    }
    @Override
    public void color() {
        System.out.println("The color of the shoe is black");
    }
}
