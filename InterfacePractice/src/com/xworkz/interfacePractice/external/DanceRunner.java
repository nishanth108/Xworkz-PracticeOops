package com.xworkz.interfacePractice.external;

import com.xworkz.interfacePractice.internal.Dance;

public class DanceRunner implements Dance {
    @Override
    public void setDance() {
        System.out.println("Comes with GOod Size");
    }

    @Override
    public void practice() {
        System.out.println("Comes with 2k ");
    }

    @Override
    public void perform() {
        System.out.println("Comes with GOod Meterial");
    }

    @Override
    public void performOnStage() {
        System.out.println("Promising on ");
    }
}
