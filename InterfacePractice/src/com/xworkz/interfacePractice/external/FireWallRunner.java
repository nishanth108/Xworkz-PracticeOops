package com.xworkz.interfacePractice.external;

import com.xworkz.interfacePractice.internal.FireWall;

public class FireWallRunner implements FireWall {
    @Override
    public void name() {
        System.out.println("Comes with GOod Size");
    }

    @Override
    public void team() {
        System.out.println("Comes with 2k ");
    }

    @Override
    public void networth() {
        System.out.println("Comes with GOod Meterial");
    }
}
