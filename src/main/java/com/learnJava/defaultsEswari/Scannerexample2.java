package com.learnJava.defaultsEswari;

import java.util.Scanner;

public class Scannerexample2 {

    public static void main(String[] args){
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter Username, age, salary");
        String userName = myObj.nextLine();

        int age = Integer.parseInt(myObj.nextLine());
        double salary = Double.parseDouble(myObj.nextLine());

        System.out.println("The enter Username :" + userName);
        System.out.println("The enter age :" + age);
        System.out.println("The enter salary :" + salary);

    }
}
