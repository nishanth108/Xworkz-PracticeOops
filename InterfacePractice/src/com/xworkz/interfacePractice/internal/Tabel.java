package com.xworkz.interfacePractice.internal;

public interface Tabel {
    void style();
    void price();
    void meterial();
    default void bend() {
        System.out.println("Bending the Tabel");
    }
}
