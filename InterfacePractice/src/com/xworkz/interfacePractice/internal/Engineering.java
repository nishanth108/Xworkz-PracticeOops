package com.xworkz.interfacePractice.internal;

public interface Engineering {
    void jobs();
    void averageSalary();
    void promotion();
    default void hire() {
        System.out.println("Hiring !!");
    }
}
