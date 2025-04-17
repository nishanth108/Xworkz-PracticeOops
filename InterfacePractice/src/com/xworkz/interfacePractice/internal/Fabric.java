package com.xworkz.interfacePractice.internal;

public interface Fabric {
    void type();
    void price();
    void quality();
    default void employeeSalary() {
        System.out.println("the salary of the employee is more");
    }
}
