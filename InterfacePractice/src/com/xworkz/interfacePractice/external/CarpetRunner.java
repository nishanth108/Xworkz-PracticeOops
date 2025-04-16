package com.xworkz.interfacePractice.external;

import com.xworkz.interfacePractice.internal.Carper;

public class CarpetRunner implements Carper {
    @Override
    public void name() {
        System.out.println("Name is romo");
    }

    @Override
    public void price() {
        System.out.println("Comes with 2k ");
    }

    @Override
    public void style() {
        System.out.println("Comes with GOod Style");
    }
}
