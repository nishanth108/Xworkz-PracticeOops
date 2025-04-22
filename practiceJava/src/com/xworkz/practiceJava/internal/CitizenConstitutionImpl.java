package com.xworkz.practiceJava.internal;

public class CitizenConstitutionImpl implements Constitution{

    public CitizenConstitutionImpl() {
        System.out.println("Running Citizen constitution Implementation");
    }

    @Override
    public void followRules() {
        System.out.println("Folloe the rules in constitution");
    }
}
