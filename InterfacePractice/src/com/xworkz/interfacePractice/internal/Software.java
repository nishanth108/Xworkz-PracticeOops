package com.xworkz.interfacePractice.internal;

public interface Software {
    void name();
    void client();
    void workFlow();
    default void deploy() {
        System.out.println("deploy the software");
    }
}
