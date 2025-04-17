package com.xworkz.interfacePractice.internal;

public interface FaceBook {
    void namr();
    void team();
    void networth();
    default void addReel() {
        System.out.println("Adding Reel Section");
    }
}
