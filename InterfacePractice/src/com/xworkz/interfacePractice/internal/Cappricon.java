package com.xworkz.interfacePractice.internal;

public interface Cappricon {
    void sign();
    void benifits();
    void personality();
    default void horoScope() {
        System.out.println("see the horoScope");
    }
}
