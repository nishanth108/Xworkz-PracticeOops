package com.xworkz.interfacePractice.external;

import com.xworkz.interfacePractice.internal.Iron;
import com.xworkz.interfacePractice.internal.IronPipe;

public class IronPipeRunner implements IronPipe {
    @Override
    public void shape() {
        System.out.println("Comes with GOod Size");
    }

    @Override
    public void price() {
        System.out.println("Comes with 2k ");
    }

    @Override
    public void quality() {
        System.out.println("Comes with GOod Meterial");
    }
}
