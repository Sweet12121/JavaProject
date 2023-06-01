package com.learnJava.Examples;

public class ReverseString {

    public static void main(String[] args) {
        String input = "Hello, World121!";

        String removeNumber = input.replaceAll("[0-9]","");
        String stringonly = input.replaceAll("[^A-Za-z]"," ");

        System.out.println(" Removed the no***: " +removeNumber);
        System.out.println("String Only " +stringonly);



        String output = reverseString(input);
        String output2 = reverseString(stringonly);
        System.out.println(output);
        System.out.println(output2);
    }

    private static String reverseString(String str) {
        if(str.isEmpty()){
            return str;
        }
        return reverseString(str.substring(1)) +str.charAt(0);
    }


}
