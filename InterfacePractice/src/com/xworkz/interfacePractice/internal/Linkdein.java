package com.xworkz.interfacePractice.internal;

public interface Linkdein {
    void name();
    void networth();
    void team();
    default void findJob() {
        System.out.println("Finding Job");
    }
}
