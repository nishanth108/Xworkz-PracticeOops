package com.xworkz.interfacePractice.internal;

public interface Copper {
    void quantity();
    void price();
    void usage();
    default void use() {
        System.out.println("Used in many field");
    }
}
