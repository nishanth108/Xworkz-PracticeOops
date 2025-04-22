package com.xworkz.practiceJava.internal;

public class Cylinder {
    private Gas gas;

    public Cylinder(Gas gas) {
        System.out.println("No arg constractor");
        this.gas = gas;
    }
    public void execute() {
        if(this.gas!=null) {
            this.gas.fill();
        } else {
            System.out.println("Null pointer exception");
        }
    }

}
