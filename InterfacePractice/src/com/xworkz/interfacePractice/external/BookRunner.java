package com.xworkz.interfacePractice.external;

import com.xworkz.interfacePractice.internal.Book;

public class BookRunner implements Book {
    @Override
    public void name() {
        System.out.println("The name of the book is countrl yourself");
    }

    @Override
    public void author() {
        System.out.println("The name of the author is james ");
    }

    @Override
    public void publisher() {
        System.out.println("Publisher name is Ramu");
    }
}
