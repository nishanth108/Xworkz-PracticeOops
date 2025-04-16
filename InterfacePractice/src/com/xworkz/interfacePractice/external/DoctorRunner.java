package com.xworkz.interfacePractice.external;

import com.xworkz.interfacePractice.internal.Doctor;

import javax.print.Doc;

public class DoctorRunner implements Doctor {
    @Override
    public void ram() {
        System.out.println("Comes with GOod Size");
    }

    @Override
    public void charge() {
        System.out.println("Comes with 2k ");
    }

    @Override
    public void checkPatient() {
        System.out.println("Comes with GOod Meterial");
    }
}
