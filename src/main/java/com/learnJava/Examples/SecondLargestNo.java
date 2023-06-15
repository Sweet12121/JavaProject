package com.learnJava.Examples;

public class SecondLargestNo {

    public static void main(String[] args){
        int arr[] = {0,2,2,100,21,23,23,56,67};

        int largest = 0;
        int secondLargest = 0;
        System.out.println(" The given array is " );

        for (int i =0;i< arr.length;i++){

            System.out.println(arr[i] + "\t");

        }
        for (int i=0; i< arr.length;i++){
            if(arr[i] > largest){
                secondLargest = largest;
                largest = arr[i];
            }else if (arr[i] > secondLargest)
            {
                secondLargest = arr[i];
            }
        }
        System.out.println("\nSecond largest number is:" + secondLargest);
        System.out.println("Largest Number is: "  +largest);
    }
        }


