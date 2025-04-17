package com.xworkz.interfacePractice.internal;

public interface Steel {

    void strength();
    void quallty();
    void price();
    default void shape() {
        System.out.println("Seeing the Shape");
    }
}
