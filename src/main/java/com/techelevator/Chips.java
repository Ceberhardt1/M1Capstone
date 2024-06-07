package com.techelevator;

public class Chips extends Items{

    String chips = "Crunch Crunch, Yum!";

    public Chips(String slot, String name, double price, String  quantity) {
        super(slot,name, price, quantity);

    }

    public String getChips() {
        return chips;
    }


//    public String toString(){
//        return chips;
//    }
}
