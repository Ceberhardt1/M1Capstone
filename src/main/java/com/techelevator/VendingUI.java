package com.techelevator;

import java.io.FileNotFoundException;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class VendingUI {



    private Scanner myScanner;

     private Inventory inventory = new Inventory();




    public VendingUI(Scanner myScanner) throws FileNotFoundException {
        this.myScanner = myScanner;
    }




    // main menu pop up
    public String showMainMenu() {

        //print main menu and return the user's choice:

        System.out.println("Welcome to Vendors Vending, :)");
        System.out.println("1. Display items");
        System.out.println("2. Purchase items :D");
        System.out.println("3. Leave -_-");

        return myScanner.nextLine();


    }
    public String showPurchaseMenu() {

        //print main menu and return the user's choice:

        System.out.println("1. Feed Money");
        System.out.println("2. Select Product");
        System.out.println("3. finish purchase");




        return myScanner.nextLine();


    }

    public void leaveMessage(){
        System.out.println("thanks for coming, goodbye");
    }

    public void askForDollarAmount(){
        System.out.println("please enter a dollar amount, between 1-10");
//        return myScanner.nextLine();
    }


    public String askForQuantity(){
        System.out.println("how much do you want?");
        return myScanner.nextLine();
    }

    public String askForSlotID(){
        System.out.println("enter slot ID");
        return myScanner.nextLine();
    }

    public void displayItems(Items itemss){

        if (itemss.getQuantity() > 0){
            System.out.println(itemss.toString());
        } else {
            System.out.println(itemss.soldOutItem());
        }
    }

    public void displayMoney(double mone){
        System.out.println("current money: " + mone);
    }

    public void displaySnacksPriceType(Items items){
        System.out.println(items.getName() + " " + items.getPrice() + " - For Each Item! ");
    }
    public void displayQuantity(int quant){
        System.out.println(quant + " left in the machine");
    }

    public void changeString(String word){
        System.out.println(word);
    }

    public void printYum(){

    }
    public void notenoughMoneError(){
        System.out.println("not enought mone for transaction");
    }
    public void noquant(){
        System.out.println("this item is or will be out of quantity, please select a different item or amount");
    }
    public void despensedItem(Items items){
        System.out.println(items.getName() + " : " + items.getPrice() + " " + items.getYummy());
    }
    public void showFormattedList(List<Items> callList){
        for (Items in : callList){
            System.out.println(in);
        }
    }





}
