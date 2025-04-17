package com.xworkz.interfacePractice.internal;

public interface Villa {
    void name();
    void price();
    void location();
    default void buyVilla() {
        System.out.println("Buying Villa");
    }
}
