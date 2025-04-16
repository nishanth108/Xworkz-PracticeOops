package com.xworkz.interfacePractice.external;

import com.xworkz.interfacePractice.internal.Earth;

public class EarthRunner implements Earth {
    @Override
    public void waterContent() {
        System.out.println("Comes with GOod Size");
    }

    @Override
    public void countyList() {
        System.out.println("Comes with 2k ");
    }

    @Override
    public void forestAreas() {
        System.out.println("Comes with GOod Meterial");
    }
}
