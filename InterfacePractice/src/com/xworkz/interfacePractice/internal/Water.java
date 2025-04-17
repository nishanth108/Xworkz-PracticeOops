package com.xworkz.interfacePractice.internal;

public interface Water {
    void name();
    void price();
    void ml();
    default void quanitiy() {
        System.out.println("quantity of water you need");
    }
}
