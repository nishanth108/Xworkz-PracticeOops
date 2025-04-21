package com.xworkz.interfacePractice.external;

import com.xworkz.interfacePractice.internal.Villa;

public class VillaRunner implements Villa {
    @Override
    public void name() {
        System.out.println("Comes with GOod Size");
    }

    @Override
    public void price() {
        System.out.println("Comes with 2k ");
    }

    @Override
    public void location() {
        System.out.println("Comes with GOod Meterial");
    }

    @Override
    public void buyVilla() {
        System.out.println("Buying villa");
    }
}
