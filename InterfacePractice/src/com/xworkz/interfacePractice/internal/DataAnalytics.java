package com.xworkz.interfacePractice.internal;

public interface DataAnalytics {
    void jobDescription();
    void salary();
    void Responsibility();
    default void getJob() {
        System.out.println("getting job is easy if u have perticular Skill");
    }
}
