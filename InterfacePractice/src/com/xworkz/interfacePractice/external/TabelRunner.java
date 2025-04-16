package com.xworkz.interfacePractice.external;

import com.xworkz.interfacePractice.internal.Tabel;

public class TabelRunner implements Tabel {
    @Override
    public void style() {
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
