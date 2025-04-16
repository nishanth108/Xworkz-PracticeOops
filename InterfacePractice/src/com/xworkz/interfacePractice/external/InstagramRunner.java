package com.xworkz.interfacePractice.external;

import com.xworkz.interfacePractice.internal.Instagram;

public class InstagramRunner implements Instagram {
    @Override
    public void namr() {
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
