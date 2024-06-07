package com.techelevator;

import java.util.Scanner;

public class MoneyBox {

    public double machineMoneyBalance;

   private Scanner myScanner = new Scanner(System.in);




    // method to ask for dollars, then add dollars to the machine
    // as well as checking if value is within the correct range
    public double feedMoney(){
        // grabbing a value from the next line

        double moneyGiven = Double.parseDouble(myScanner.nextLine());
        if (moneyGiven > 0 && moneyGiven <= 10) {
            machineMoneyBalance += moneyGiven;
        }
        return machineMoneyBalance;

    }

    public double takeAwayMoney(Double debt){
        machineMoneyBalance -= debt;
        return machineMoneyBalance - debt;
    }




    //Getters && Setters


    public double getMachineMoneyBalance() {
        return machineMoneyBalance;
    }

    public void setMachineMoneyBalance(double machineMoneyBalance) {
        this.machineMoneyBalance = machineMoneyBalance;
    }


    public String  spitChange(double mone){

        int coins = (int) (mone * 100);

        int quarters = coins / 25;
        coins %= 25;

        int nickles = coins / 5;
        coins %= 5;
        int dimes = coins / 10;
        coins %= 10;

        // Print the counts of each coin
       String chaangeSay = ("youre change is: Quarters: " + quarters + ", Dimes: " + dimes + ", Nickels: " + nickles);
        return chaangeSay;




    }
    public boolean isvalidPurcahse(double d1, double d2){
        if ((d1 - d2) >= 0){
            return true;
        } else {
            return false;
        }
    }

}
