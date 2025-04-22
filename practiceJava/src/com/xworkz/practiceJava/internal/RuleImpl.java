package com.xworkz.practiceJava.internal;

public class RuleImpl implements Rule {
    public RuleImpl() {
        System.out.println("no arg construtor");
    }

    @Override
    public void stopCheating() {
        System.out.println("Cheating is prohibited");
    }

}
