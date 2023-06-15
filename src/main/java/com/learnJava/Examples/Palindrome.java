package com.learnJava.Examples;

import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the input :");
        String A = scanner.nextLine();
        scanner.close();
        A = A.toLowerCase();
        int start = 0;

        int end = A.length()-1;
        boolean isPlaindrome = true;
        while (start<end){
            if(A.charAt(start) != A.charAt(end)){
                isPlaindrome = false;
                break;

            }start++;
            end--;

        }
        if(isPlaindrome){
            System.out.println("yes");
        }else {
            System.out.println("No");
        }

    }
}
