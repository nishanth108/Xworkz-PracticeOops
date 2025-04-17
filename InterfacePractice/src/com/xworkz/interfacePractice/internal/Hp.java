package com.xworkz.interfacePractice.internal;

public interface Hp {
    void ram();
    void price();
    void processor();
    default void lunch() {
        System.out.println("Lunching the new laptop");
    }
}
