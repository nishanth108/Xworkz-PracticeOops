package com.xworkz.interfacePractice.internal;

public interface Charger {

    void plugIn();
    void plugOut();
    void capacity();
    default void type() {
        System.out.println("there are lot of type of Charger");
    }
}
