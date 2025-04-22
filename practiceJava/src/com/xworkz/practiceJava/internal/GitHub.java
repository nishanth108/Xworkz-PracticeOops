package com.xworkz.practiceJava.internal;

public class GitHub {
    Git git;

    public GitHub(Git git) {
        System.out.println("Parameterized construtor of Github");
        this.git = git;
    }
    public void execute() {
        if(git!=null) {
            git.download();
        } else {
            System.out.println("Null pointer exception");
        }
    }
}
