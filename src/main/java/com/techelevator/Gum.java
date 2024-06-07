package com.techelevator;

public class Gum extends Items{




    public Gum(String slot, String name, double price, String type) {
        super(slot,name, price, type);

    }

    @Override
    public String getYummy() {
        yummy = "Chew Chew, YUM!";
        return super.getYummy();
    }
}
