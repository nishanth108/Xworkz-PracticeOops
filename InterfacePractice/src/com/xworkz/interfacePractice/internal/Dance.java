package com.xworkz.interfacePractice.internal;

public interface Dance {
    void setDance();
    void practice();
    void perform();
    default void performOnStage() {
        System.out.println("Performing on stage");
    }
}
