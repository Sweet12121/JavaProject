package com.learnJava.Examples;

import java.util.Scanner;

public class SplitWord {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the input ");
        String input = scanner.next();

        String part1 = input.substring(0,input.length()/2);

        String part2 = input.substring(input.length()/2);

        System.out.println("First word is : " +part1);
        System.out.println("First word is : " +part2);
    }
}
class SplitString {
    public static void main(String[] args) {
        String input = "AutomationJava";

        // Split the string into two parts
        String part1 = input.substring(0, 9); // "Automation"
        String part2 = input.substring(9);    // "Java"

        // Print the two parts
        System.out.println("Part 1: " + part1);
        System.out.println("Part 2: " + part2);
    }
}
