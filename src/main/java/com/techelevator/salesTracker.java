package com.techelevator;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class salesTracker {


    private String product;

    private int countProduct;

    Map<String, Integer> saleProductMap = new HashMap<>();




    public Map<String, Integer> getSaleProductMap() {
        return saleProductMap;
    }

    public void setSaleProductMap(Map<String, Integer> saleProductMap) {
        this.saleProductMap = saleProductMap;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public int getCountProduct() {
        return countProduct;
    }

    public void setCountProduct(int countProduct) {
        this.countProduct = countProduct;
    }

    public void addPoduct(Items items) {
         product = items.getName();
         countProduct = 0;
        if (saleProductMap.containsKey(product)) {
//            countProduct = saleProductMap.get(product);
            saleProductMap.put(product, countProduct + 1);
            countProduct ++;
        } else {
            saleProductMap.put(product, 1);
            countProduct ++;
        }


    }
}
