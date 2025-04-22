package com.xworkz.practiceJava.internal;

public class EngineImpl implements Engine {
    public EngineImpl() {
        System.out.println("no arg constructer of EnginerImpl");
    }


    @Override
    public void cc() {
        System.out.println("Its of 200cc");
    }
}
