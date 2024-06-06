package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class StockFileReader {

    //Make a public list to store the file name

    // map for tracking quantity
    public Map<Integer, Items> quantityTrackMap = new TreeMap<>();
    public List<Items> loadFile() throws FileNotFoundException {

        File stockFile = new File("vendingmachine.csv");

        //Create list to contain and add items from file
        List<Items> listOfItems = new ArrayList<>();

        //now make a try catch, and scanner to read from the file
        try (Scanner scanner = new Scanner(stockFile)){
            //Loop through to the end of the file
            while(scanner.hasNextLine()){
                Items item = new Items();

                //grabbing a record of the file, to stick into an object
                String record = scanner.nextLine();
                String[] fields = record.split("\\|") ;


                //setting parts of the object ex: name, and quantity
                item.setSlot(fields[0]);
                item.setName(fields[1]);
                item.setPrice(Double.parseDouble(fields[2]));
                item.setType(fields[3]);


                // makes a map of the items along with their quantity which is default 10
                quantityTrackMap.put(10, item);


                //add items to list
                listOfItems.add(item);






            }
        }
        for(Items items: listOfItems){
            System.out.println(items);
        }
        System.out.println(listOfItems);
        return listOfItems;


    }



}
