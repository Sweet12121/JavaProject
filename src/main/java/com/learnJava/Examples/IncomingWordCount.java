package com.learnJava.Examples;

import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

public class IncomingWordCount {

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the input :");
        String str = input.nextLine();

        Map<String,Long> wordCount = (Map<String, Long>) Arrays.stream(str.split("\\s+"))
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));

       for( Map.Entry<String, Long> entry : wordCount.entrySet()){
           System.out.println(entry.getKey() + ":" + entry.getValue());

       }
    }

}
