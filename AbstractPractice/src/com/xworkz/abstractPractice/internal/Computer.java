package com.xworkz.abstractPractice.internal;

public abstract class Computer {
    private int price;
    private String name;
    private String color;
    private String ram;

    public Computer(int price){
        this.price=price;
    }

    public Computer(String name,String color) {
        this.name = name;
        this.color = color;
    }

    public Computer(String ram, int price) {
        this.ram = ram;
        this.price = price;
    }
}
