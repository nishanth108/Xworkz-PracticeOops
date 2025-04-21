package com.xworkz.interfacePractice.external;

import com.xworkz.interfacePractice.internal.Schooty;

public class SchootyRunner implements Schooty {
    @Override
    public void name() {
        System.out.println("Comes with GOod Size");
    }

    @Override
    public void price() {
        System.out.println("Comes with 2k ");
    }

    @Override
    public void milege() {
        System.out.println("Comes with GOod Meterial");
    }

    @Override
    public void electric() {
        System.out.println("Running schooty");
    }
}
