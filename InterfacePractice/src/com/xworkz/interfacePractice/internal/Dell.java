package com.xworkz.interfacePractice.internal;

public interface Dell {
    void name();
    void price();
    void processor();
    default void launch() {
        System.out.println("Launching a new lap");
    }
}
