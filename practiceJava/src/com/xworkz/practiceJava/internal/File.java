package com.xworkz.practiceJava.internal;

public class File {
    Structure structure;

    public File(Structure structure) {
        System.out.println("parameterized constructer");
        this.structure = structure;
    }
    public void execute() {
        if(structure!=null) {
            structure.type();
        } else {
            System.out.println("Null pointer exception");
        }
    }
}
