package com.xworkz.practiceJava.internal;

public class GitConfigImpl implements Git{
    public GitConfigImpl() {
        System.out.println("No arg constructor");
    }

    @Override
    public void download() {
        System.out.println("downloading git software");
    }
}
