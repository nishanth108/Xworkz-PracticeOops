package com.xworkz.interfacePractice.external;

import com.xworkz.interfacePractice.internal.Bed;

public class BedRunner implements Bed {
    @Override
    public void size() {
        System.out.println("Comes with GOod Size");
    }

    @Override
    public void price() {
        System.out.println("Comes with 2k ");
    }

    @Override
    public void meterial() {
        System.out.println("Comes with GOod Meterial");
    }
}
