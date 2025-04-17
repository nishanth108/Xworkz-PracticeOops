package com.xworkz.interfacePractice.internal;

public interface Doctor {
    void ram();
    void charge();
    void checkPatient();
    default void buildNewHospital() {
        System.out.println("Building new Hospital");
    }
}
