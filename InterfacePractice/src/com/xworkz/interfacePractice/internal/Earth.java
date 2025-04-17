package com.xworkz.interfacePractice.internal;

public interface Earth {
    void waterContent();
    void countyList();
    void forestAreas();
    default void PureWaterPercentage() {
        System.out.println("THERE ARE less water in earth around 5%");
    }
}
