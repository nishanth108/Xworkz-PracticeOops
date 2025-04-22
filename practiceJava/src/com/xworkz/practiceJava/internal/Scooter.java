package com.xworkz.practiceJava.internal;

public class Scooter {
    Engine engine;

    public Scooter(Engine engine) {
        System.out.println("Parameterized constructor");
        this.engine = engine;
    }

    public void execute() {
        if(engine!=null) {
            engine.cc();
        } else {
            System.out.println("Null pointer exception");
        }
    }


}
