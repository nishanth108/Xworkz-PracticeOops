package com.xworkz.practiceJava.internal;

public class SkinCare {
    private KojicAcid kojicAcid;

    public SkinCare(KojicAcid kojicAcid) {
        System.out.println("This is parameterized Constructor");
        this.kojicAcid = kojicAcid;
    }

    public void execute() {
        if(this.kojicAcid!=null) {
            this.kojicAcid.apply();
        } else {
            System.out.println("Null pointer exception");
        }
    }
}
