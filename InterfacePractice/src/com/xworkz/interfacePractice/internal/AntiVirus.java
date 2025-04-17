package com.xworkz.interfacePractice.internal;

public interface AntiVirus {
    void name();
    void virusDetected();
    void killVirus();
    default void subscription() {
        System.out.println("Pay for activing the pack");
    }
}
