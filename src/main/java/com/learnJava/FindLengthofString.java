package com.learnJava;

public class FindLengthofString {

    public static void main(String[] args){

        String sentence = "My:new,learning";

      String[]  words = sentence.split(":");
      System.out.println("Split result word : " +words);

     String lastword = words[words.length - 1];
     int lastwordlenght = lastword.length()-1;

     System.out.println(" lastword :" +lastword);
     System.out.println("Lastword Lenght :" +lastwordlenght);

    }
}
