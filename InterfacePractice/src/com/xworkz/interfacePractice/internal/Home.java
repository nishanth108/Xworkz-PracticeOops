package com.xworkz.interfacePractice.internal;

public interface Home {
    void nema();
    void members();
    void goHome();
    default void sleep() {
        System.out.println("Sleeping in home");
    }
}
