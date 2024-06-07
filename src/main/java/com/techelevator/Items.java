package com.techelevator;

public class Items {

    //Create private variables
    private String name;
    private double price;
    private String slot;
    private String type;
    private int quantity = 10;

    public String yummy;


    //Create constructor

    public Items(String slot, String name, double price,  String type) {
        this.slot = slot;
        this.name = name;
        this.price = price;
        this.type = type;
        this.quantity = 10;
        this.yummy = "";

    }

    public Items() {
        //empty default constructor
    }

    //toString method




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

    public int getQuantity() {
        return quantity;
    }

    public double setQuantity(int quantity) {
        this.quantity = quantity;
        return quantity;
    }

    public String getYummy() {
        return yummy;
    }

    @Override
    public String toString() {

        return slot + '|' + '$' + price + '|' + name + '|' + type + '|' + quantity;
    }

    public String soldOutItem(){
            return slot + '|' + '$' + price + '|' + name + '|' + type + '|' + "SOLD OUT";
    }
}
