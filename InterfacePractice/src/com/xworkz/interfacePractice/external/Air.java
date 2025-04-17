package com.xworkz.interfacePractice.external;

public class Air implements com.xworkz.interfacePractice.internal.Air {
    @Override
    public void airQuality() {
        System.out.println("airquality inside the Air runner Class");
    }

    @Override
    public void airSpeed() {
        System.out.println("air Speed inside the air runner Class");
    }

    @Override
    public void coldOrHotAir() {
        System.out.println("cold air  inside the Air runner Class");
    }

    @Override
    public void breateAir() {
        System.out.println("Breate air of premium");
    }
}

