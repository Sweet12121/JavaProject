package com.learnJava.Examples;

import java.util.Scanner;

public class SwapNumbers {

    public static void main(String[] args){
  int x,y,temp;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the input x and y :");
        x = input.nextInt();
        y= input.nextInt();

        System.out.println("Before swapping: " +x +y);
        temp =x;
        x=y;
        y=temp;

        System.out.println("After swapping : " +x+y);


    }
}
