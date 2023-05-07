package com.learnJava.arrayList;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ReadFile {

    public static void main(String[] args){
        try{

            File myobj = new File("C:\\Users\\gmuru\\Documents\\US -bank - resume\\eswari.txt");
            Scanner myReader = new Scanner(myobj);
            while (myReader.hasNextLine()){
                String data = myReader.nextLine();
                System.out.println(data);
            }
            myReader.close();
        }
        catch (IOException e){
            System.out.println("An error in reading:");
            e.printStackTrace();
        }

    }
}
