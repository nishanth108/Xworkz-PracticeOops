package com.xworkz.interfacePractice.internal;

public interface Belt {
    void size();
    void price();
    void meterial();
    default  void topOne() {
        System.out.println("");
    }
}
