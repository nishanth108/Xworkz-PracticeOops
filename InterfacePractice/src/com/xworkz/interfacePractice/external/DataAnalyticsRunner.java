package com.xworkz.interfacePractice.external;

import com.xworkz.interfacePractice.internal.DataAnalytics;

public class DataAnalyticsRunner implements DataAnalytics {
    @Override
    public void jobDescription() {
        System.out.println("Comes with GOod Size");
    }

    @Override
    public void salary() {
        System.out.println("Comes with 2k ");
    }

    @Override
    public void Responsibility() {
        System.out.println("Comes with GOod Meterial");
    }

    @Override
    public void getJob() {
        System.out.println("got the job");
    }
}
