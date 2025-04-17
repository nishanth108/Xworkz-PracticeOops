package com.xworkz.interfacePractice.internal;

public interface Carper {
    void name();
    void price();
    void style();
    default void shape() {
        System.out.println("Coming with a new Shape");
    }
}
