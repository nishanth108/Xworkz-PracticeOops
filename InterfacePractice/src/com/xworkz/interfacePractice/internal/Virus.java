package com.xworkz.interfacePractice.internal;

public interface Virus {
    void name();
    void type();
    void details();
    default void reason() {
        System.out.println("Virus due to unknown link");
    }
}
