package com.xworkz.practiceJava.internal;

public class Bcci {
    Icc icc;
    public Bcci(Icc icc) {
        System.out.println("One argument constuctor in Bcci");
        this.icc=icc;
    }

    public void execute() {
        if (this.icc!=null) {
            System.out.println("We are inside the execute method");
            this.icc.fairPlay();

        } else {
            System.out.println("There is a null pointer exception inside the Bcci Execute methoda");
        }
    }
}
