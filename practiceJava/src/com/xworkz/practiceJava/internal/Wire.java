package com.xworkz.practiceJava.internal;

public class Wire {
    Copper copper;

    public Wire(Copper copper) {
        System.out.println("This Is parameterized Construter");
        this.copper = copper;
    }
    public void execute() {
        if(copper!=null) {
            copper.quality();
        } else {
            System.out.println("Null pointer exception");
        }
    }
}
