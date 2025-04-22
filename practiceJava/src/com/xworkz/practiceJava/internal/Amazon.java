package com.xworkz.practiceJava.internal;

public class Amazon {
    private Web amazon;

    public Amazon(Web amazon) {
        System.out.println("parameterized construtor");
        this.amazon = amazon;
    }

    public void execute() {
        if(this.amazon!=null) {
            this.amazon.design();
        } else {
            System.out.println("Null pointer exception");
        }
    }
}
