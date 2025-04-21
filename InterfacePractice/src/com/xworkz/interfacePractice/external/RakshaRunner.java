package com.xworkz.interfacePractice.external;

import com.xworkz.interfacePractice.internal.Raksha;

public class RakshaRunner implements Raksha {
    @Override
    public void name() {
        System.out.println("Comes with GOod Size");
    }

    @Override
    public void personality() {
        System.out.println("Comes with 2k ");
    }

    @Override
    public void character() {
        System.out.println("Comes with GOod Meterial");
    }

    @Override
    public void pushCode() {
        System.out.println("Pusing the code via githhib");
    }
}
