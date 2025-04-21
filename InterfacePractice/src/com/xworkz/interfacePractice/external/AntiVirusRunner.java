package com.xworkz.interfacePractice.external;

import com.xworkz.interfacePractice.internal.AntiVirus;

public class AntiVirusRunner implements AntiVirus {
    @Override
    public void name() {
        System.out.println("windowa antivirus");
    }

    @Override
    public void killVirus() {
        System.out.println("Killing The Virus");
    }

    @Override
    public void virusDetected() {
        System.out.println("Virus Detected take action");
    }

    @Override
    public void subscription() {
        System.out.println("Get subscription ");
    }
}
