package com.xworkz.interfacePractice.internal;

public interface Cave {
    void locatedIn();
    void enterCave();
    void exitCave();
    default void extendCave() {
        System.out.println("extending Cave");
    }
}
