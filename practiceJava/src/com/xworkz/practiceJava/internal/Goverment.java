package com.xworkz.practiceJava.internal;

public class Goverment {
    private Constitution constitution;
    public Goverment(Constitution constitution) {
        System.out.println("Running parametarized constructior in Goverment");
        this.constitution=constitution;
    }

    public void execute() {
        System.out.println("We are inside the excute method of Goverment");
    }

}
