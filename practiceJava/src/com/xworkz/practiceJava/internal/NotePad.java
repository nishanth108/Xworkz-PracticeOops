package com.xworkz.practiceJava.internal;

public class NotePad {
    Software software;

    public NotePad(Software software) {
        System.out.println("Running Parameterized construter");
        this.software = software;
    }
    public void execute() {
        if(software!=null) {
            software.deploy();
        } else {
            System.out.println("Null pointer exception");
        }
    }
}
