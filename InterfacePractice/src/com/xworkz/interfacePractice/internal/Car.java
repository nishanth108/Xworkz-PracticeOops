package com.xworkz.interfacePractice.internal;

public interface Car {
    void engine();
    void price();
    void capacity();
    default void newLunch() {
        System.out.println("Launching new Car");
    }
}
