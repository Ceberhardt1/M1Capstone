package com.techelevator;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class logWriter {

    private String fileName = "log.txt";

    public void writeToLog( String typeOftransactiom, String key, double beforeMoney, double afterMoney){

        File logFile = new File(fileName);
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("MM/dd/yyyy HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        String formattedDate = dateTimeFormatter.format(now);


        try {

            if (! logFile.exists()){
                logFile.createNewFile();
            }

            FileWriter fileWriter = new FileWriter(logFile, true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            bufferedWriter.write(formattedDate + ": " + typeOftransactiom +  " " + key + " : $" + beforeMoney + " $" + afterMoney);
            bufferedWriter.newLine();
            bufferedWriter.flush();
//            bufferedWriter.close();


        }
        catch (Exception e){

        }
    }



}
