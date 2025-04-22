package com.xworkz.practiceJava.internal;

public class Action {
    private Function function;

    public Action(Function function) {
        System.out.println("Parameterized Constracter");
        this.function = function;
    }

    public void execute() {
        if(function!=null) {
            function.jump();
        } else {
            System.out.println("Null pointer exception");
        }
    }

}
