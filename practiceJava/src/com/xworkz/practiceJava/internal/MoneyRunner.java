package com.xworkz.practiceJava.internal;

public class MoneyRunner implements Money{
    public MoneyRunner() {
        System.out.println("No arg constructer");
    }

    @Override
    public void printMoney() {
        System.out.println("Implementing Money");
    }
}
