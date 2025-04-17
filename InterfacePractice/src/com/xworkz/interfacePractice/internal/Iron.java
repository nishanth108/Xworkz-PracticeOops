package com.xworkz.interfacePractice.internal;

public interface Iron {
    void shape();
    void price();
    void strgnth();
    default void bend() {
        System.out.println("Bending Iron");
    }
}
