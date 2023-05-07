package com.learnJava.defaultsEswari;
import java.io.*;
import java.util.*;


    //Determine the minimum number of jumps it will take the climber to reach the flag’s exact height
    class Jump{
        static int minJumps(int arr[],int l,int h){

            if(h == 1)
             return 0;
            if(arr[1] == 0)
                return Integer.MAX_VALUE;
            int min = Integer.MAX_VALUE;
            for (int i = l + 1; i <= h && i <= l + arr[l];
                 i++) {
                int jumps = minJumps(arr, i, h);
                if (jumps != Integer.MAX_VALUE
                        && jumps + 1 < min)
                    min = jumps + 1;
            }
            return min;

        }
        public static void main(String[] args){
            int arr[] = { 1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9};
            int n = arr.length;
            System.out.println("Min number of  jumps to reach height h :" + minJumps(arr,0,n-1));

        }
    }

