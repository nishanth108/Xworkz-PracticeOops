package com.xworkz.practiceJava.internal;

public class Pencil {
    private Graphite graphite;

    public Pencil(Graphite graphite) {
        System.out.println("Parameterized constructer");
        this.graphite = graphite;
    }
    public void execute() {
        if(this.graphite!=null) {
            this.graphite.quality();
        } else {
            System.out.println("Null pointer exception");
        }
    }


}
