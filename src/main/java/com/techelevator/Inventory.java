package com.techelevator;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Inventory {

    private StockFileReader fileReader = new StockFileReader();
    private Map<String, Items> newMap;


// add string to constrcutor
    public Inventory() throws FileNotFoundException {
        this.newMap = fileReader.loadFile();

    }




    public List<Items> retreiveList(){
        List <Items> itemsListInventory = new ArrayList<>();

        for (Map.Entry<String, Items> entry : newMap.entrySet()) {
            Items item = entry.getValue();
            itemsListInventory.add(item);

        }
        return itemsListInventory;
    }
    // check quan

    // check ava

    public boolean isQuantityMoreThenZero(Items items){
        if (items.getQuantity() > 0){
            return true;
        }
        return false;
    }

    public boolean isThereEnoughMoney(Double money2) {
        if (money2 > 0) {
            return true;
        }
        return false;
    }
 }

