package com.xworkz.interfacePractice.internal;

public interface Bench {
    void meterial();
    void price();
    void lifeSpan();
    default void sit() {
        System.out.println("Sitting in bench");
    }
}
