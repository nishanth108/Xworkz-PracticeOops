package com.xworkz.interfacePractice.internal;

public interface Zip {
    void name();
    void extract();
    void makeZip();
    default void rename() {
        System.out.println("Renaming the zip");
    }
}
