package com.xworkz.practiceJava.internal;

public class MaterialImpl implements Meterial{
    public MaterialImpl() {
        System.out.println("no arg constructor of Material Impl");
    }

    @Override
    public void price() {
        System.out.println("THe price of the material is 2k");
    }
}
