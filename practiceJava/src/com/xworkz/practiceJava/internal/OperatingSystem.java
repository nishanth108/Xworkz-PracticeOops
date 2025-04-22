package com.xworkz.practiceJava.internal;

public class OperatingSystem {

    Laptop laptop;
    public OperatingSystem(Laptop laptop) {
        System.out.println("Running parameterized construtor inside the Operating system");
        this.laptop=laptop;
    }
    public void execute() {
        System.out.println("Running excute inside the operating System");
        laptop.process();
    }
}
