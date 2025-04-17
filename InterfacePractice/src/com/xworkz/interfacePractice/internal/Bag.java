package com.xworkz.interfacePractice.internal;

public interface Bag {
    void size();
    void quality();
    void capacity();
    default void companyChange() {
        System.out.println("Comapany changed to jojo");
    }
}
