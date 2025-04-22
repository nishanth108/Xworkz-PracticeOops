package com.xworkz.practiceJava.internal;

public class BenchUser {
    Bench bench;


    public BenchUser(Bench bench) {
        System.out.println("We are in the BenchUser");
        this.bench = bench;
    }

    public void excute() {
        if(bench!=null) {
            bench.sit();
            bench.build();
        }
        else {
            System.out.println("Null is expected due to null , lol");
        }
    }
}
