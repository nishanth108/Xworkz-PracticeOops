package com.xworkz.interfacePractice.external;

import com.xworkz.interfacePractice.internal.Virus;

public class VirusRunner implements Virus {
    @Override
    public void name() {
        System.out.println("Comes with GOod Size");
    }

    @Override
    public void type() {
        System.out.println("Comes with 2k ");
    }

    @Override
    public void details() {
        System.out.println("Comes with GOod Meterial");
    }

    @Override
    public void reason() {
        System.out.println("The reason is non hygenic");
    }
}
