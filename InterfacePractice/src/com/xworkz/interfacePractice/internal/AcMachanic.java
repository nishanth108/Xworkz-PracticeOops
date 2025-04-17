package com.xworkz.interfacePractice.internal;

public interface AcMachanic {
    void repair();
    void salary();
    void goToWork();

    default void takeHoliday() {
        System.out.println("Taking Holiday");
    }
}
