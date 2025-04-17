package com.xworkz.interfacePractice.internal;

public interface LanCabel {
    void cabelLength();
    void price();
    void putLan();
    default void takeLan() {
        System.out.println("taking lan");
    }
}
