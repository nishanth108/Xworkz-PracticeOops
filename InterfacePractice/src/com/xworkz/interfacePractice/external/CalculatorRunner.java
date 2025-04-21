package com.xworkz.interfacePractice.external;

import com.xworkz.interfacePractice.internal.Calculator;

public class CalculatorRunner implements Calculator {
    @Override
    public void name() {
        System.out.println("calcualator name is Casio");
    }

    @Override
    public void price() {
        System.out.println("Comes with 2k ");
    }

    @Override
    public void type() {
        System.out.println("the type of the calculator is scientfic");
    }

    @Override
    public void includeFeature() {
        System.out.println("Includeing more features in the machine");
    }
}
