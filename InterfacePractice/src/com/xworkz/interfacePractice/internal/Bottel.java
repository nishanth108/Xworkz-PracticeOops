package com.xworkz.interfacePractice.internal;

public interface Bottel {
    void name();
    void liter();
    void price();
    default void fillBottel() {
        System.out.println("Filling the bottel");
    }
}
