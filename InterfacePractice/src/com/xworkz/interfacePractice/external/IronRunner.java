package com.xworkz.interfacePractice.external;

import com.xworkz.interfacePractice.internal.Iron;

public class IronRunner implements Iron {
    @Override
    public void shape() {
        System.out.println("Comes with GOod Size");
    }

    @Override
    public void price() {
        System.out.println("Comes with 2k ");
    }

    @Override
    public void strgnth() {
        System.out.println("Comes with GOod Meterial");
    }

    @Override
    public void bend() {
        System.out.println("u can bend the iron");
    }
}
