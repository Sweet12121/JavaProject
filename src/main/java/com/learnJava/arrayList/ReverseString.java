package com.learnJava.arrayList;

public class ReverseString {

    public static void main(String[] args){

        String orginalString = "SIVAESWARI";
        String reverseString = "";

        for( int i =0; i < orginalString.length();i++){
        reverseString = orginalString.charAt(i)+reverseString;

        System.out.println("Reverser output : " +reverseString);
        }
    }
}
