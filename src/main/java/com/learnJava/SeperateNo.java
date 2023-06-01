package com.learnJava;

public class SeperateNo {

    public static void main(String[] args){

        String input = "MY121 String432 exa098";

        String[] parts = input.split(" ");

        for(String part : parts){

            String number = part.replaceAll("[^0-9]", "");
            String string = part.replaceAll("[^A-Za-z]", "");

            System.out.println("Numbers " +number);
            System.out.println("String : " +string);
        }


    }


}
