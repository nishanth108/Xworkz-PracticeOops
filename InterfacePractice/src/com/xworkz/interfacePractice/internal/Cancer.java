package com.xworkz.interfacePractice.internal;

public interface Cancer {
    void sign();
    void benifits();
    void personality();
    default void horoScope() {
        System.out.println("Seeing the HoroScope");
    }
}
