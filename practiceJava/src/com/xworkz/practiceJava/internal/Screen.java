package com.xworkz.practiceJava.internal;

public class Screen {
    Glass glass;

    public Screen(Glass glass) {
        System.out.println("parameterized constructor");
        this.glass = glass;
    }
    public void execute() {
        if(glass!=null) {
            glass.durability();
        } else {
            System.out.println("Null pointer exception");
        }
    }
}
