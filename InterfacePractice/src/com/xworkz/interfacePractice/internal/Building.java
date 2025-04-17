package com.xworkz.interfacePractice.internal;

public interface Building {
    void name();
    void locatedIn();
    void capacity();
    default void upScaling() {
        System.out.println("Up Scalling The Building");
    }
}
