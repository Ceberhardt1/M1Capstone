package com.techelevator;

import java.util.Scanner;

public class PurchaseMenu {


    //show purchaseMenu
    private Scanner myScanner;

    public PurchaseMenu(Scanner myScanner){
        this.myScanner = myScanner;
    }
    Change change = new Change();

    public String showPurchaseMenu() {

        //print main menu and return the user's choice:

        System.out.println("1. Feed Money");
        System.out.println("2. Select Product");
        System.out.println("3. finish purchase");

        System.out.println("current money provided: $" + change.machineMoney);

        return myScanner.nextLine();


    }





}
