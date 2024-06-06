package com.techelevator;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Inventory {

    private StockFileReader fileReader;

    public Inventory(StockFileReader fileReader) {
        this.fileReader = fileReader;
    }

    public List<Items> retreiveList(Map<String, Items> map){
        List <Items> itemsListInventory = new ArrayList<>();

        for (Map.Entry<String, Items> entry : map.entrySet()) {
            Items item = entry.getValue();
            itemsListInventory.add(item);

        }
        return itemsListInventory;
    }
 }

