package com.xworkz.practiceJava.internal;

public class FootballImpl implements Football {
    public FootballImpl() {
        System.out.println("No arg Constructor");
    }

    @Override
    public void score() {
        System.out.println("Scoring the Goal");
    }
}
