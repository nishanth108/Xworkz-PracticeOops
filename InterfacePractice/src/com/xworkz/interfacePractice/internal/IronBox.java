package com.xworkz.interfacePractice.internal;

public interface IronBox {
    void size();
    void price();
    void watt();
    default void matchBox() {
        System.out.println("matchBox");
    }
}
