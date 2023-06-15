package com.learnJava.Examples;

import java.util.Scanner;



public class PrimeDemo {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the input no");

        int number = input.nextInt();
        boolean isPrime = isPrime(number);
        input.close();
        if(isPrime){
            System.out.println("No is prime " +number);

        }
        else {
            System.out.println("No is not a prime no " +number);
        }
    }

    private static boolean isPrime(int number) {
        if(number <=1){
            return false;
        }
        for(int i =2;i<= Math.sqrt(number);i++){
            if(number %i ==0){
                return false;
            }
        } return true;
    }
}
