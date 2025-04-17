package com.xworkz.interfacePractice.internal;

public interface SamSung {
    void ram();
    void price();
    void processor();
    default void newFeature() {
        System.out.println("Adding new Features");
    }
}
