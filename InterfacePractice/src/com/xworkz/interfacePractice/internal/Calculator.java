package com.xworkz.interfacePractice.internal;

public interface Calculator {
    void name();
    void type();
    void price();
    default void includeFeature() {
        System.out.println("including new features");
    }
}
