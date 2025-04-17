package com.xworkz.interfacePractice.internal;

public interface Fire {
    void sign();
    void benifits();
    void todaysHoroscope();
    default void soulmate() {
        System.out.println("visit fire sign compability in google");
    }
}
