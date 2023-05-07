package com.learnJava.arrayList;

import java.util.Scanner;

public class AddTwoNo {

    public static void main(String[] args){
        int x,y,sum;

        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter the first input :");
        x = myObj.nextInt();
        System.out.println("Enter the Second input :");
        y = myObj.nextInt();

        sum = x+y;
        System.out.println("total sum : " +sum);
    }
}
