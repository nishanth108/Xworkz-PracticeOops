package com.xworkz.interfacePractice.internal;

public interface Raksha {
    void name();
    void personality();
    void character();
    default void pushCode() {
        System.out.println("Pusing Code to git");
    }
}
