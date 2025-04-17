package com.xworkz.interfacePractice.internal;

public interface Kishan {
    void walkHome();
    void study();
    void doTask();
    default void pushToGit() {
        System.out.println("pusing code to git");
    }
}
