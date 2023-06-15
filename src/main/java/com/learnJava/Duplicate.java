package com.learnJava;

import com.fasterxml.jackson.databind.node.IntNode;

import java.util.HashSet;
import java.util.Set;

public class Duplicate {

    public static void main(String[] args){

        Integer[] numbers = {1,2,3,3,5,4,6,3,4,8,7};

        Set<Integer> uniqueNumber = new HashSet<>();
        Set<Integer> duplicate = new HashSet<>();

        for (Integer number : numbers){
            if (!uniqueNumber.add(number)){
         duplicate.add(number);
            }
        }
        System.out.println(duplicate);
    }
}
