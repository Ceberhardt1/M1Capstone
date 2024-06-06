package com.techelevator;

import java.util.Scanner;

public class Change {


    private double machineMoneyBalance;

   private Scanner myScanner = new Scanner(System.in);




    // method to ask for dollars, then add dollars to the machine
    // as well as checking if value is within the correct range
    public double eatingMoney(){
        // grabbing a value from the next line
        double moneyGiven = Double.parseDouble(myScanner.nextLine());
        if (moneyGiven > 0 && moneyGiven <= 10) {
            machineMoneyBalance += moneyGiven;
            // displays the current current amount in the machine
        }
        return machineMoneyBalance;

    }



    //Getters && Setters


    public double getMachineMoneyBalance() {
        return machineMoneyBalance;
    }

    public void setMachineMoneyBalance(double machineMoneyBalance) {
        this.machineMoneyBalance = machineMoneyBalance;
    }
}
