package com.xworkz.interfacePractice.external;

import com.xworkz.interfacePractice.internal.Building;

public class BuildingRunner implements Building {
    @Override
    public void name() {
        System.out.println("name is lolocomplex");
    }

    @Override
    public void locatedIn() {
        System.out.println("Comes with 2k ");
    }

    @Override
    public void capacity() {
        System.out.println("Comes with GOod Capacity");
    }
}
