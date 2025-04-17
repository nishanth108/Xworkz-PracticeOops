package com.xworkz.interfacePractice.internal;

public interface Window {
    void coloe();
    void type();
    void price();
    default void quality() {
        System.out.println("Comes with good quality");
    }
}
