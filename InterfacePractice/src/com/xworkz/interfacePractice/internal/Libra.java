package com.xworkz.interfacePractice.internal;

public interface Libra {
    void todaysHoroScope();
    void luckyNumber();
    void luckyColor();
    default void horoScope() {
        System.out.println("see horoScope from facebook");
    }
}
