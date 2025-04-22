package com.xworkz.practiceJava.internal;

public class Watch {
    Leather leather;

    public Watch(Leather leather) {
        System.out.println("Parameter constructor in Watch");
        this.leather = leather;
    }
    public void execute() {
        if(leather!=null) {
            leather.size();
        } else {
            System.out.println("Null pointer exception");
        }
    }
}
