package com.xworkz.interfacePractice.internal;

public interface Pepole {
    void name();
    void personality();
    void character();
    default void population() {
        System.out.println("population of pepole growing day by day");
    }
}
