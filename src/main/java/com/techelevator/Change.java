package com.techelevator;

import java.util.Scanner;

public class Change {


    public double machineMoney;

   private Scanner myScanner = new Scanner(System.in);

// method to ask for dollars, then add dollars to the machine
    // aswell as checking if value is within the correct range
    public double eatingMoney(){
        System.out.println("insert dollar amount, 1-10");
        // grabbing a value from the next line
        double moneyGiven = Double.parseDouble(myScanner.nextLine());
        if (moneyGiven > 0 && moneyGiven <= 10) {
            machineMoney += moneyGiven;
            // displays the current current amount in the machine
            System.out.println("current money provided: $" + machineMoney);
        } else {
            System.out.println("please input a valid value :)");
        }
        return machineMoney;

    }




//    try (Scanner scanner = new Scanner(System.in)){
//    }


}
