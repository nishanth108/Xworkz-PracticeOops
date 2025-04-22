package com.xworkz.practiceJava.internal;

public class Argentenia {
    Football football;

    public Argentenia(Football football) {
        System.out.println("Parameterized Construtor");
        this.football = football;
    }
    public void execute() {
        if(football!=null) {
            football.score();
        } else {
            System.out.println("Null pointer exception");
        }
    }
}
