package com.xworkz.interfacePractice.internal;

public interface Book {
    void name();
    void author();
    void publisher();
    default void partTwo() {
        System.out.println("Doing the part 2 of the book");
    }
}
