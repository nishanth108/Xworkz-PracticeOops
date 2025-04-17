package com.xworkz.interfacePractice.internal;

public interface X {
    void name();
    void networth();
    void team();
    default void spamDetection() {
        System.out.println("Detecting Spams");
    }
}
