package com.xworkz.interfacePractice.internal;

public interface Vivo {
    void ram();
    void price();
    void processor();
    default void launch() {
        System.out.println("lauching Vivo 17 pro");
    }
}
