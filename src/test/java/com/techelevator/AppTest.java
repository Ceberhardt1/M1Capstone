package com.techelevator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.FileNotFoundException;

public class AppTest {

    Application application;
    MoneyBox moneyBox;
    Inventory inventory;



    @Before
        public void initiate() throws FileNotFoundException {
            application = new Application();
            moneyBox = new MoneyBox();
            inventory = new Inventory();


        }
    @Test
        public void happyPath(){
        //make sure program works normally

    }
    //Testing moneyBox()
    @Test
        public void moneyBox(){
        Double money = 7.00;
        String expected = ("youre change is: Quarters: " + 28 + ", Dimes: " + 0 + ", Nickels: " + 0);;
        String actual = (moneyBox.spitChange(money));

        Assert.assertEquals(expected, actual);
    }
    @Test
    public void moneyBoxUnevenChange(){
        Double money = 7.15;
        String expected = ("youre change is: Quarters: " + 28 + ", Dimes: " + 1 + ", Nickels: " + 1);;
        String actual = (moneyBox.spitChange(money));

        Assert.assertEquals(expected, actual);
    }
    @Test
        public void isValidPurchase(){
        boolean expected = true;
        Double input1 = 10.00;
        Double input2 = 6.00;

        boolean actual = moneyBox.isvalidPurcahse(input1, input2 );
        Assert.assertEquals(expected, actual);
    }
    @Test
        public void isThereEnoughMoney(){
        boolean expected = true;
        Double input1 = 10.00;
        boolean actual = inventory.isThereEnoughMoney(input1);
        Assert.assertEquals(expected, actual);
    }
    @Test
        public void




}
