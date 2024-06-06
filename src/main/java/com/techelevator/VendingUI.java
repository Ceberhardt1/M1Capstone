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

    public void displayItems(Items mhm){
        System.out.println(mhm);
    }

    public void displayMoney(double mone){
        System.out.println("current money provided: " + mone);
    }

    public void displaySnacksPriceType(Items items){
        System.out.println(items.getName() + " " + items.getPrice());
    }


}
