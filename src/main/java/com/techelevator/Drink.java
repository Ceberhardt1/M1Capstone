package com.techelevator;

public class Drink extends Items{

    String drink = "Glug Glug, Yum!";

    public Drink(String slot, String name, double price, String quantity) {
        super(slot,name, price, quantity);

    }
    @Override
    public String getYummy() {
        yummy = "Glug Glug, YUM!";
        return super.getYummy();
    }
}
