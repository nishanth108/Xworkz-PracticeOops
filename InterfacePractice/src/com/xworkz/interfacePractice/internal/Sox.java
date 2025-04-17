package com.xworkz.interfacePractice.internal;

public interface Sox {
    void name();
    void price();
    void color();
    default void wear() {
        System.out.println("Wearing the song");
    }
}
