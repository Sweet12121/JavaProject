package com.learnJava.Examples;

import java.util.HashMap;
import java.util.Scanner;

public class CountWords {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the input :");
     String str = input.next();

        String[] str2 = str.split(" ");
        HashMap<String,Integer> map = new HashMap<String,Integer>();
    for (int i=0;i<str.length();i++){
        if(map.containsKey(str2[i])){
            int count = map.get(str2[i]);
            map.put(str2[i],count+1);
        }
        else {
            map.put(str2[i],1);
        }
    }
  System.out.println(map);
    }
}
