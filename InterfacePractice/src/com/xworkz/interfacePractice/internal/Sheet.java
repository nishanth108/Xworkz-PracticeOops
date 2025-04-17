package com.xworkz.interfacePractice.internal;

public interface Sheet {
    void name();
    void price();
    void quality();
    default void quantity() {
        System.out.println("takke how much quantity u want");
    }
}
