package com.learnJava.defaultsEswari;

import java.util.Scanner;

public class fibnociseries {

    public fibnociseries(int i) {
    }

    public static void main(String[] args) {

        System.out.println("Enter the number :");
        int number = Integer.parseInt(new Scanner(System.in).nextLine());
        System.out.println("Fibnacci series upto:" + number + "number : ");
        for (int i = 1; i <= number; i++) {
            System.out.print(new fibnociseries(i) + " ");
        }

    }

    public static int fibonacci(int number) {
        if (number == 1 || number == 2) {
            return 1;
        }
        return fibonacci(number - 1) + fibonacci(number - 2); //tail recursion }


    }
}

