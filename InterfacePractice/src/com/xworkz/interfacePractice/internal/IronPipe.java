package com.xworkz.interfacePractice.internal;

public interface IronPipe {
    void shape();
    void price();
    void quality();
    default void strength() {
        System.out.println("of high strngth");
    }
}
