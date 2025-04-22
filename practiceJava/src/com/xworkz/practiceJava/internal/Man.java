package com.xworkz.practiceJava.internal;

public class Man {
    private Car car;

    public Man(Car car) {
        System.out.println("parameterized construtor in Man");
        this.car = car;
    }
    public void execute() {
        if(this.car!=null) {
            this.car.drive();
        } else {
            System.out.println("Null pointer exception");
        }
    }

}
