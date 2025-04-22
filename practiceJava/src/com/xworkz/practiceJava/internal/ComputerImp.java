package com.xworkz.practiceJava.internal;

public class ComputerImp implements Computer{
    public ComputerImp() {
        System.out.println("No arg constructor of ComputerImp");
    }

    @Override
    public void ram() {
        System.out.println("Computer of 4Gb of ram");
    }
}
