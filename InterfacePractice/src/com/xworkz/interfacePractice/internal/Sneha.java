package com.xworkz.interfacePractice.internal;

public interface Sneha {
    void name();
    void personality();
    void character();
    default void pushCode() {
        System.out.println("Push code to the github");
    }
}
