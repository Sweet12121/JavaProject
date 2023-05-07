package com.learnJava.arrayList;

import java.io.File;
import java.io.IOException;

public class CreatenewFile {

    public static void main(String[] args){

        try {
            File objFile = new File("C:\\Users\\gmuru\\Documents\\US -bank - resume\\eswari.txt");

            if (objFile.createNewFile()) {
                System.out.println("New file created : " + objFile.getName());
            } else {
                System.out.println("File already existed: ");
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
