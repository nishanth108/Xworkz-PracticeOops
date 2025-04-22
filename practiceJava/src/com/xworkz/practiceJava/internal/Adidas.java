package com.xworkz.practiceJava.internal;

public class Adidas {
    Shoe shoe;

    public Adidas(Shoe shoe) {
        this.shoe = shoe;
        System.out.println("Parameterized Constructor");
    }

    public void execute() {
        if(this.shoe!=null) {
            shoe.color();
        } else {
            System.out.println("Null exception in Adidas Class");
        }
    }

}
