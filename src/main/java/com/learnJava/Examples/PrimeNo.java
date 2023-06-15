package com.learnJava.Examples;

import java.util.Scanner;

class PrimeNo {

    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the no:");
        int number = input.nextInt();
        boolean isPrime = isPrime(number);
        if (isPrime){
            System.out.println("No is prime :" +number);
        }
        else {
            System.out.println("No is not prime :" +number);
        }

    }
    private static boolean isPrime(int number) {
       if(number <=1){
           return false;
       }
        for (int i=2; i<= Math.sqrt(number);i++){
            if (number % i== 0){
                return false;
            }
        }return true;
    }
}
