package com.learnJava.Examples;

import java.util.Arrays;
import java.util.List;

public class Duplicate2 {

    public static void main(String[] args){

       List<Integer> inputNumbers = Arrays.asList(1,2,4,3,3,3,5,5,5,5,6,7,8,8);
        List<String> input = Arrays.asList("Hellooo, World!!,Hello,Hello,SIVA,SIVA,Eswari");
        List<String> outputList = input.stream().distinct().toList();

        List<Integer> numberOutput = inputNumbers.stream().distinct().toList();

        System.out.println(" Orginal List string  :"+input);
        System.out.println(" String List without duplicate :"+outputList);

        System.out.println(" Orginal List numbers : "+inputNumbers);
        System.out.println(" List of numbers without duplicated : "+numberOutput);

        // By using regex pattern (.)\\1+ ,$1

        String numbers = "1,2,4,3,3,3,5,5,5,5,6,7,8,8";
        String regexOutput = numbers.replaceAll("(.)\\1+","$1");


        String input2 = "Hellooo, World!!,Hello,Hello,SIVA,SIVA,Eswari";
        String output = input2.replaceAll("(.)\\1+", "$1");
        System.out.println(output);

        System.out.println("Regex output value " +regexOutput);
        System.out.println("Regex String output value " +output);

        List<String> input3 = Arrays.asList("Hello","Eswari","Hello","Siva","Awesome");

        List<String> streamStringOutput = input3.stream().distinct().toList();

        System.out.println("Strean String output value " +streamStringOutput);

    //  To remove , in the input

        String input4 = "Hello, World, Java";
        String output4 = input4.replaceAll(",", "");
        System.out.println(output4);

    }
}
