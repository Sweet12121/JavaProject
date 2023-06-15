package com.learnJava.Examples;

import java.util.Scanner;

class UserNameValidUsingReqularExp {

    public static final String regularExpression = "^[a-zA-Z]\\w{7,29}$";

}
 public class UserNameValid {
      public static void main(String[] args){

          Scanner scanner = new Scanner(System.in);
          System.out.println("Enter the input :");
          int n = scanner.nextInt();
          scanner.nextLine();
          while (n-- != 0){
              String userName = scanner.nextLine();
              if(userName.matches(UserNameValidUsingReqularExp.regularExpression)){
                  System.out.println("Valid");

              }else {
                  System.out.println("InValid");
              }
          }
          scanner.close();
      }

 }