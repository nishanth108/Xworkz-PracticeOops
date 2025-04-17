package com.xworkz.interfacePractice.internal;

public interface Xiaom {
    void ram();

    void price();

    void processor();

    default void launch() {
        System.out.println("Launching new mobile");
    }
}
