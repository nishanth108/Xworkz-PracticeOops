package com.xworkz.interfacePractice.internal;

public interface Asus {
    void ram();
    void price();
    void processor();
    default void mobileLaunch(){
        System.out.println("Launching New Mobile");
    }
}
