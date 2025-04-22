package com.xworkz.practiceJava.internal;

public class Sports {
    Rule rule;

    public Sports(Rule rule) {
        System.out.println("Parameterized constructor in Sports");
        this.rule = rule;
    }
    public void execute() {
        if(rule!=null) {
            rule.stopCheating();
        } else {
            System.out.println("Null pointer exception");
        }
    }
}
