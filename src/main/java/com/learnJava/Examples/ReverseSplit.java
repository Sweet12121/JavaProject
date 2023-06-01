package com.learnJava.Examples;

import groovy.xml.Entity;

import java.util.Scanner;

import static groovy.xml.Entity.gt;

public class ReverseSplit {

    public static void main(String[] args){

        String original, reverse = "";
        System.out.println("Enter the string to be reversed");
        Scanner in = new Scanner(System.in);
        original = in.nextLine();

     String[]   removeString = original.split("");

     String output2 = original.replaceAll("[0-9]","");

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(original);
       StringBuilder reverseOutput = stringBuilder.reverse();


        System.out.println(removeString);
        System.out.println(" Remove the number : " +output2);
        System.out.println(reverseOutput);
    }
    }

