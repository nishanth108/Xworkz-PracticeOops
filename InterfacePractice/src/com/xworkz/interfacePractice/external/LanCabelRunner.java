package com.xworkz.interfacePractice.external;

import com.xworkz.interfacePractice.internal.LanCabel;

public class LanCabelRunner implements LanCabel {
    @Override
    public void cabelLength() {
        System.out.println("Comes with GOod Size");
    }

    @Override
    public void price() {
        System.out.println("Comes with 2k ");
    }

    @Override
    public void putLan() {
        System.out.println("Comes with GOod Meterial");
    }
}
