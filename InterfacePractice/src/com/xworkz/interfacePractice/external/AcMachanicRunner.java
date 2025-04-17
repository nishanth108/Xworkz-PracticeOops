package com.xworkz.interfacePractice.external;

import com.xworkz.interfacePractice.internal.AcMachanic;

public class AcMachanicRunner implements AcMachanic {
    @Override
    public void repair() {
        System.out.println("Reparing inside the AcMachanic runner Class");
    }

    @Override
    public void salary() {
        System.out.println("Taking Salary inside the AcMachanic runner Class");

    }

    @Override
    public void goToWork() {
        System.out.println("going to work inside the AcMachanic runner Class");

    }

    @Override
    public void takeHoliday() {
        System.out.println("Take holiday as much as u want ");
    }
}

