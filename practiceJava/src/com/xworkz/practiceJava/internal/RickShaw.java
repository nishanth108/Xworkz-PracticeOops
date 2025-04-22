package com.xworkz.practiceJava.internal;

public class RickShaw {
    private Money money;

    public RickShaw(Money money) {
        System.out.println("Running  parameterized constrotot");
        this.money = money;
    }
    public void execute() {
        if(this.money!=null) {
            this.money.printMoney();
        } else {
            System.out.println("Null pointer exception");
        }
    }

}
