package com.xworkz.abstractPractice.internal;

public abstract class Door {
    private final int doorNo=14;
    private final String doorColor;
    private final String doorMaterial;

    public Door(String doorColor, String doorMaterial) {
        this.doorColor= doorColor;
        this.doorMaterial=doorMaterial;
    }

}
