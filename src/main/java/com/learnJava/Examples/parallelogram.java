package com.learnJava.Examples;

import java.util.Scanner;

public class parallelogram {

    // find the breath and height

    private static int B;
    private static int H;
    private static boolean flag;

    static {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value for B");

        B = scanner.nextInt();
        System.out.println("Enter the value for H");
        H = scanner.nextInt();
        scanner.close();

        if(B <=0 || H <= 0){
            System.out.println("java.lang.Exception: Breadth and height must be positive");
            flag = false;
        }
        else {
            flag = true;
        }
    }
    public static void main(String[] args){
        if(flag){
            int area = B*H;

            System.out.println("Output area ::"+ area);
        }
    }

}
