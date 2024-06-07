package com.techelevator;

public class Candy extends Items {

    String candy = "Munch Munch, Yum!";

    public Candy(String slot, String name, double price, String type) {
        super(slot,name, price, type);

    }

    @Override
    public String getYummy() {
        yummy = "Munch Munch, YUM!";
        return super.getYummy();
    }

}
