package com.xworkz.interfacePractice.external;

import com.xworkz.interfacePractice.internal.Software;

public class SoftwareRunner implements Software {
    @Override
    public void name() {
        System.out.println("Comes with GOod Size");
    }

    @Override
    public void client() {
        System.out.println("Comes with 2k ");
    }

    @Override
    public void workFlow() {
        System.out.println("Comes with GOod Meterial");
    }
}
