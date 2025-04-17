package com.xworkz.interfacePractice.internal;

public interface Instagram {
    void namr();
    void team();
    void networth();
    default void addShort() {
        System.out.println("Adding short Section");
    }
}
