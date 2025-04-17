package com.xworkz.interfacePractice.internal;

public interface FireWall {
    void name();
    void networth();
    void team();
    default void vpn() {
        System.out.println("implementing vpn in FireWall");
    }
}
