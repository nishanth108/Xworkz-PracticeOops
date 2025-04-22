package com.xworkz.practiceJava.internal;


public class Break {
    private BreakKey breakKey;

    public Break(BreakKey breakKey) {
        System.out.println("Implementing Break Key");
        this.breakKey = breakKey;
    }
    public void execute() {
        if(this.breakKey!=null) {
            this.breakKey.use();
        } else {
            System.out.println("Null pointer exception");
        }
    }
}
