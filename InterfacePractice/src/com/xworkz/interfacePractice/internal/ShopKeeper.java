package com.xworkz.interfacePractice.internal;

public interface ShopKeeper {
    void shopName();
    void itemPrice();
    void shopOwner();
    default void shopClose() {
        System.out.println("Closing the Shop");
    }
}
