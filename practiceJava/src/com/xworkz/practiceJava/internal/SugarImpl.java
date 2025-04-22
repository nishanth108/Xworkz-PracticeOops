package com.xworkz.practiceJava.internal;

public class SugarImpl implements Sugar {
    public SugarImpl() {
        System.out.println("No arg constructer");
    }

    @Override
    public void sugarPlant() {
        System.out.println("Needed Sugar plants");
    }
}
