package com.techelevator;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.Collection;
import java.util.Set;

public class salesWriter {

    private String fileName = "sales.log";

    public void writeToLog(String product, Integer numberBought){

        File logFile = new File(fileName);


        try {

            if (! logFile.exists()){
                logFile.createNewFile();
            }

            FileWriter fileWriter = new FileWriter(logFile, true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            bufferedWriter.write(product + "|" + numberBought);
            bufferedWriter.newLine();
            bufferedWriter.flush();
//            bufferedWriter.close();


        }
        catch (Exception e){

        }

    }


//    for (Map.Entry<String, Integer> entry : itemMap.entrySet()) {
//        System.out.println(entry.getKey() + ": " + entry.getValue());
//    }



}




