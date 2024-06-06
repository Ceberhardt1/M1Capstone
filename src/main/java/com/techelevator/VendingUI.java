package com.techelevator;

import java.util.Scanner;

public class VendingUI {



    private Scanner myScanner;

    public VendingUI(Scanner myScanner){
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

}
