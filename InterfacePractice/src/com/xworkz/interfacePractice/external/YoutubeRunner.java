package com.xworkz.interfacePractice.external;

import com.xworkz.interfacePractice.internal.Youtube;

public class YoutubeRunner implements Youtube {
    @Override
    public void name() {
        System.out.println("Comes with GOod Size");
    }

    @Override
    public void networth() {
        System.out.println("Comes with 2k ");
    }

    @Override
    public void team() {
        System.out.println("Comes with GOod Meterial");
    }

    @Override
    public void addShort() {
        System.out.println("Adding short ");
    }
}
