package com.xworkz.interfacePractice.internal;

public interface Bike {
    void engine();
    void price();
    void cc();

    default void newModel() {
        System.out.println("Lunching new model ");
    }
}
