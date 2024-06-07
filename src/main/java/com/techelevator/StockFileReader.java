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

        Map<String, Items> quantityTrackerMap = new HashMap<>();

        List<Items> listOfItems = new ArrayList<>();
        File stockFile = new File("vendingmachine.csv");

        //Create list to contain and add items from file

        //now make a try catch, and scanner to read from the file
        try (Scanner scanner = new Scanner(stockFile)) {
            //Loop through to the end of the file
            while (scanner.hasNextLine()) {
//                Items item = new Items();

                //grabbing a record of the file, to stick into an object
                String record = scanner.nextLine();
                String[] fields = record.split("\\|");


                //setting parts of the object ex: name, and quantity
//                Gum.setSlot(fields[0]);
//                Gum.setName(fields[1]);
//                item.setPrice(Double.parseDouble(fields[2]));
//                if 3 = gum
//                item.setType(fields[3]);
//                item gum = new Gum();
//                //setters
//
//                // makes a map of the items along with their quantity which is default 10
//
//                quantityTrackerMap.put(item.getSlot(), item);

                //add items to list
               // listOfItems.add(item);


            }
        }
        return quantityTrackerMap;
    }
}
