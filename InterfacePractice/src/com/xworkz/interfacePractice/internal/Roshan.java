package com.xworkz.interfacePractice.internal;

public interface Roshan {
    void name();
    void personality();
    void character();
    default void pushCode() {
        System.out.println("Pusing COde to git");
    }
}
