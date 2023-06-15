package com.learnJava.Examples;

import java.util.Scanner;

public class MultipliesNNumbers {


    /*Given an integer, N, print its first 10 multiples.
    Each multiple N (where 1<= i <=10)
    should be printed on a new line in the form: N x i = Result.

    Input Format: A single integer, N.
            Constraint: 2 <= N <= 20
    Output Format

    Print 10 lines of output; each line i (where 1<= i <=10)
    contains the result of N x i in the form: N x i = result.*/
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the input :");

        int N = scanner.nextInt();
        scanner.close();

      // Check if N is within valid range or
        if(N < 2 || N >20){
            System.out.println("Invalid input. N must be between 2 and 20.");
        }
        else
            for(int i =1 ;i<= 10; i++){
                int result = N*i;
                int result2= N +i;
                System.out.printf("%d * %d = %d%n",N,i,result);
                System.out.printf("%d + %d = %d%n",N,i,result2);
            }

    }

}
