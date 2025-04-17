package com.xworkz.interfacePractice.internal;

public interface Lenovo {
    void putCharge();
    void price();
    void processor();
    default void launch() {
        System.out.println("launching new laptop");
    }
}
