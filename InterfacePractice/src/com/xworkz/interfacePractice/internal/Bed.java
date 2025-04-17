package com.xworkz.interfacePractice.internal;

public interface Bed {
    void size();
    void price();
    void meterial();
    default void comfort() {
        System.out.println("introducing good comfort");
    }
}
