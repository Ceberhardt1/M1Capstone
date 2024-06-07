package com.techelevator;

public class Candy extends Items {

    String candy = "Munch Munch, Yum!";

    public Candy(String slot, String name, double price, String quantity) {
        super(slot,name, price, quantity);

    }

    @Override
    public String getYummy() {
        yummy = "Munch Munch, YUM!";
        return super.getYummy();
    }

}
