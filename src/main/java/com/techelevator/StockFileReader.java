package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class StockFileReader {

    MoneyBox change = new MoneyBox();

    private Scanner myScanner;

    // making a constructor for this scanner
    public StockFileReader() {
//        this.myScanner = myScanner;
    }

    //Make a public list to store the file name

    // map for tracking quantity

    public Map<String, Items> loadFile() throws FileNotFoundException {

        Map<String, Items> quantityTrackerMap = new TreeMap<>();

        List<Items> listOfItems = new ArrayList<>();
        File stockFile = new File("vendingmachine.csv");

        //Create list to contain and add items from file

        //now make a try catch, and scanner to read from the file
        try (Scanner scanner = new Scanner(stockFile)) {
            //Loop through to the end of the file
            while (scanner.hasNextLine()) {



                //grabbing a record of the file, to stick into an object
                String record = scanner.nextLine();
                String[] fields = record.split("\\|");


//                setting parts of the object ex: name, and quantity

                if (fields[3].equalsIgnoreCase("Gum")){

                    quantityTrackerMap.put(fields[0], new Gum(fields[0], fields[1], Double.parseDouble(fields[2]), fields[3]));

                } else if (fields[3].equalsIgnoreCase("Candy")){

                    quantityTrackerMap.put(fields[0],new Candy(fields[0], fields[1], Double.parseDouble(fields[2]), fields[3]));

                } else if (fields[3].equalsIgnoreCase("Drink")){

                    quantityTrackerMap.put(fields[0], new Drink(fields[0], fields[1], Double.parseDouble(fields[2]), fields[3]));

                } else if (fields[3].equalsIgnoreCase( "Chip")){

                    quantityTrackerMap.put(fields[0], new Chips(fields[0], fields[1], Double.parseDouble(fields[2]), fields[3]));


                }




                // makes a map of the items along with their quantity which is default 10

//                quantityTrackerMap.put(item.getSlot(), item);

//                add items to list


            }
        }
        return quantityTrackerMap;
    }
}
