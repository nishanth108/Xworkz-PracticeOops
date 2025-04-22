package com.xworkz.practiceJava.internal;

public class ImplementBench implements Bench{

    public ImplementBench(){
        super();
        System.out.println("we are in the no arg constrictot");
    }

    @Override
    public void build() {
        System.out.println("Implementintg the Bench");
    }

    @Override
    public void sit() {
        System.out.println("Sit on the bench chutiye");
    }
}
