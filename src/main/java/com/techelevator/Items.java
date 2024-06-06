package com.techelevator;

public class Items {

    //Create private variables
    private String name;
    private double price;
    private String slot;
    private String type;


    //Create constructor

    public Items(String name, double price, String slot, String type) {
        this.name = name;
        this.price = price;
        this.slot = slot;
        this.type = type;
    }

    public Items() {
        //empty default constructor
    }

    //toString method

    @Override
    public String toString() {
        return slot + '|' + '$' + price + '|' + name + '|' + type ;
    }


    //Generate getters/setters for variables


    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setSlot(String slot) {
        this.slot = slot;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getSlot() {
        return slot;
    }

    public String getType() {
        return type;
    }
}
