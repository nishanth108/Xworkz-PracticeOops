package com.xworkz.interfacePractice.internal;

public interface Aluminium {
    void strength();
    void quallty();
    void price();
    default void makePlate() {
        System.out.println("Making Plate");

    }
}
