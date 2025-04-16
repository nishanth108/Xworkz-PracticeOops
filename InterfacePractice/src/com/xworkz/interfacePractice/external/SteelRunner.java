package com.xworkz.interfacePractice.external;

import com.xworkz.interfacePractice.internal.Steel;

public class SteelRunner implements Steel {
    @Override
    public void strength() {
        System.out.println("Comes with GOod Size");
    }

    @Override
    public void quallty () {
        System.out.println("Comes with 2k ");
    }

    @Override
    public void price() {
        System.out.println("Comes with GOod Meterial");
    }
}
