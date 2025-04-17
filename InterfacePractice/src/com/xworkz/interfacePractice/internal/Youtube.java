package com.xworkz.interfacePractice.internal;

public interface Youtube {
    void name();
    void networth();
    void team();
    default void addShort() {
        System.out.println("Adding Short Video Section");
    }
}
