package com.xworkz.interfacePractice.internal;

public interface Poco {
        void ram();
    void price();
    void processor();
    default void version(){
        System.out.println("New Version is avaliable on Poco");
    }
}
