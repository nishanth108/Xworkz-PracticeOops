package com.xworkz.interfacePractice.external;

import com.xworkz.interfacePractice.internal.Kishan;

public class KishanRunner implements Kishan {
    @Override
    public void walkHome() {
        System.out.println("Comes with GOod Size");
    }

    @Override
    public void study() {
        System.out.println("Comes with 2k ");
    }

    @Override
    public void doTask() {
        System.out.println("Comes with GOod Meterial");
    }

    @Override
    public void pushToGit() {
        System.out.println("Pusing this to git");
    }
}
