package com.xworkz.practiceJava.internal;

public class Leviten {
    private Tail tail;

    public Leviten(Tail tail) {
        System.out.println("no arg constrator");
        this.tail = tail;
    }
    public void execute() {
        if(this.tail!=null) {
            this.tail.use();
        } else {
            System.out.println("Null pointer exception");
        }
    }

}
