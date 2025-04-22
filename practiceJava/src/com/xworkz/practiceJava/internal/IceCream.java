package com.xworkz.practiceJava.internal;

public class IceCream {
    private Milk milk;

    public IceCream(Milk milk) {
        System.out.println("Running parameterized constructer");
        this.milk = milk;
    }
    public void execute() {
        if(this.milk!=null) {
            this.milk.useMilk();
        } else {
            System.out.println("Null pointer exception");
        }
    }
}
