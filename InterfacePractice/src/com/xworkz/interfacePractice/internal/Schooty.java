package com.xworkz.interfacePractice.internal;

public interface Schooty {

    void name();
    void price();
    void milege();
    default void electric() {
        System.out.println("Implementing the Electric Schooty");
    }
}
