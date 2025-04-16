package com.xworkz.interfacePractice.external;

import com.xworkz.interfacePractice.internal.Sheet;
import com.xworkz.interfacePractice.internal.ShopKeeper;

public class ShopKeeperRunner implements ShopKeeper {
    @Override
    public void shopName() {
        System.out.println("Comes with GOod Size");
    }

    @Override
    public void itemPrice() {
        System.out.println("Comes with 2k ");
    }

    @Override
    public void shopOwner() {
        System.out.println("Comes with GOod Meterial");
    }
}
