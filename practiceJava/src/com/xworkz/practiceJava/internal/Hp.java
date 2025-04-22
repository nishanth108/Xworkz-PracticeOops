package com.xworkz.practiceJava.internal;

public class Hp {
    Computer computer;

    public Hp(Computer computer) {
        System.out.println("Parameterized constructor of Hp");
        this.computer = computer;
    }
    public void execute() {
        if(computer!=null) {
            computer.ram();
        } else {
            System.out.println("Null pointer exception");
        }
    }
}
