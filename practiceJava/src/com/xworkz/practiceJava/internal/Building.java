package com.xworkz.practiceJava.internal;

public class Building {
    private Architecture architecture;

    public Building(Architecture architecture) {
        System.out.println("No arg constructer");
        this.architecture = architecture;
    }
    public void execute() {
        if(this.architecture!=null) {
            this.architecture.mvc();
        } else {
            System.out.println("Null pointer exception");
        }
    }


}
