package com.xworkz.interfacePractice.internal;

public interface Rishi {
    void name();
    void personality();
    void character();
    default void pushCode() {
        System.out.println("Push code to git");
    }
}
