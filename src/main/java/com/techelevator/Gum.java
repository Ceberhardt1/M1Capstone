package com.techelevator;

public class Gum extends Items{




    public Gum(String slot, String name, double price, String quantity) {
        super(slot,name, price, quantity);

    }

    @Override
    public String getYummy() {
        yummy = "Chew Chew, YUM!";
        return super.getYummy();
    }
}
