package com.xworkz.interfacePractice.internal;

public interface Leo {
    void todaysHoroScope();
    void luckyNumber();
    void luckyColor();
    default void horoScope() {
        System.out.println("See HoroScope for free");
    }
}
