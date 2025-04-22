package com.xworkz.practiceJava.internal;

public class Rice {
    private Land land;

    public Rice(Land land) {
        System.out.println("We have parameterized construter in Rice");
        this.land = land;
    }
    public void execute() {
        if(this.land!=null) {
            this.land.cent();
        } else {
            System.out.println("Null pointer exception");
        }
    }
}
