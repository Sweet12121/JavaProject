package com.learnJava.Examples;

import java.util.Arrays;
import java.util.stream.Collectors;

public class SeperateDuplicate {

    public static void main(String[] args){

        String inputValue = "ASDFZZZrgterter";

        String output = inputValue.concat("");
       int t = inputValue.indexOf("S");
     boolean t2 = inputValue.contains("Z");
        System.out.println(t2);
        System.out.println(output);

        // to remove repeated letters

        String removedduplicateletter = inputValue.replaceAll("(.)\\1+","$1");

        System.out.println(removedduplicateletter);

        // To remove integer in input string

        String numberinput = "Adsad788asdas121";

        String numbersonly = numberinput.replaceAll("[^0-9]","");
        String stringonly = numberinput.replaceAll("[0-9]","");

        System.out.println(stringonly);
        System.out.println(numbersonly);
        //To remove all occurrences of numbers and print the remaining characters in ascending order from a given string in Java, you can follow these steps:

        String modifiedString = numberinput.replaceAll("\\d","");

        char[] charArray = modifiedString.toCharArray();
        Arrays.sort(charArray);

        String sortedString = new String(charArray);
        String noOnly = numberinput.replaceAll("[A-Za-z]","");

        System.out.println("Only String " + modifiedString);
        System.out.println("Only Numbers  " + noOnly);
        System.out.println("Only String ascending order   " + sortedString);
        System.out.println("TESTJAVA" + 10*20);
        System.out.println(10*20+"TESTJAVA");

        String Employee = "Em12312ployee1212";

        String emplString = Employee.replaceAll("[^A-Za-z]","");
        String emplNo = Employee.replaceAll("[^0-9]","");
        int length = Employee.length();
        int index =  Employee.indexOf("y");
       String charAt = String.valueOf(Employee.charAt(4));

        System.out.println(" EmployeeName " +emplString);
        System.out.println(" EmployeeNo : " +emplNo);
        System.out.println(" Employee length  : " +length);
        System.out.println(" Employee y index: " +index);
        System.out.println(" Employee char: " +charAt);

        String EmployeeCourse = "Java121 AWS253 Python";

        String java = EmployeeCourse.replaceAll("[0-9]","");
        System.out.println(" Employee course: " +java);

        // By using java 8 streams

       String[] course = EmployeeCourse.split("\\s+");
       String streamresult = Arrays.stream(course)
               .filter(s -> !s.matches(".*\\d.*"))
               .collect(Collectors.joining(""));
       System.out.println("Output from java8 : " +streamresult);

        String input = "Java121 AWS253 Python";
        String result = Arrays.stream(input.split("\\s+")) // Split the string by whitespace
                .filter(s -> !s.matches(".*\\d.*")) // Filter out strings containing numbers
                .collect(Collectors.joining(" ")); // Join the remaining strings with whitespace

        System.out.println("Result from chat " +result);


    }
}
