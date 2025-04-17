package com.xworkz.interfacePractice.internal;

public interface Mac {
    void putCharge();
    void price();
    void processor();
    default void Launch() {
        System.out.println("launching new lap");
    }
}
