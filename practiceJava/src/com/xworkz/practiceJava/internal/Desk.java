package com.xworkz.practiceJava.internal;

public class Desk {
    Plastick plastick ;

    public Desk(Plastick plastick) {
        System.out.println("Para meterixed constrictor");
        this.plastick = plastick;
    }


    public void execute() {
        if(plastick!=null) {
            plastick.color();
        } else {
            System.out.println("Null pointer exception");
        }
    }


}
