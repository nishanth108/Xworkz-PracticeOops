package com.xworkz.interfacePractice.internal;

public interface Aries {
    void benifits();
    void signNature();
    void dateOfBirth();
    default void detailOf2025() {
        System.out.println("things will go well ");
    }
}
