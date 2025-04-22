package com.xworkz.practiceJava.internal;

public class Enter {
    private Press press;

    public Enter(Press press) {
        System.out.println("Parametrized Constructor");
        this.press = press;
    }

    public void execute() {
        if(press!=null) {
            press.enter();
        } else {
            System.out.println("Null pointer exception");
        }
    }
}
