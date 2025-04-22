package com.xworkz.practiceJava.internal;

public class AntiVirus {

    Model model;
    public AntiVirus(Model model) {
        System.out.println("Parameterized constructor in Antivirus");
        this.model=model;
    }
    public void execute() {
        if(model!=null) {
            model.name();
        } else {
            System.out.println("Null pointer exception");
        }
    }
}
