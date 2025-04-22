package com.xworkz.practiceJava.external;

import com.xworkz.practiceJava.internal.Bench;
import com.xworkz.practiceJava.internal.BenchUser;
import com.xworkz.practiceJava.internal.ImplementBench;

public class BenchRunner {

    public static void main(String[] args) {
        Bench bench = new ImplementBench();

        BenchUser benchUser = new BenchUser(bench);
        benchUser.excute();
    }
}
