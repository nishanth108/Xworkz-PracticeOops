package com.xworkz.interfacePractice.internal;

public interface Air {
    void airQuality();
    void airSpeed();
    void coldOrHotAir();

    default void breateAir() {
        System.out.println("Breating Air");
    }
}
