package com.learnJava.Examples;

import java.util.Scanner;

public class Solution {



        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int n = scanner.nextInt();
            scanner.nextLine();
            final String regularExpression = "^[a-zA-Z]\\w{7,29}$";

            while (n-- != 0) {
                String username = scanner.nextLine();

                if (username.matches(regularExpression)) {
                    System.out.println("Valid");
                } else {
                    System.out.println("Invalid");
                }
            }

            scanner.close();
        }
    }

