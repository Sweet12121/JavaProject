package com.learnJava.Examples;

public class ReverseStringUsingStringMethod {

    public static void main(String[] args){

        String str = "Automation13213";

       StringBuilder stringBuilder = new StringBuilder();
       stringBuilder.append(str);
       stringBuilder = stringBuilder.reverse();

        System.out.println("Output of reverse method :" +stringBuilder);

        // Remove the no and reverse

        String str2 = str.replaceAll("[0-9]","");
        System.out.println("Replace no  :" +str2);

        StringBuilder stringBuilder1 = new StringBuilder();

        stringBuilder1.append(str2);
       stringBuilder1.reverse();
        System.out.println("Output of reverse method :" +stringBuilder1);

    }
}
