package com.xworkz.interfacePractice.external;

import com.xworkz.interfacePractice.internal.Belt;

public class BeltRunner implements Belt {
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

    @Override
    public void topOne() {
        System.out.println("Building top one Belt");
    }
}
