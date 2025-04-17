package com.xworkz.interfacePractice.internal;

public interface Redmi {
    void ram();
    void price();
    void processor();
    default void launch() {
        System.out.println("Launhing new mobile");
    }
}
