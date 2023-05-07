package com.learnJava.lamdas;

import java.util.Comparator;

public class ComparatorLamdaExample {
    public static void main(String[] args) {

        Comparator<Integer> comparator = (Integer a, Integer b)  -> a.compareTo(b);
        System.out.println("Result of comparator is:" +comparator.compare(3,3));
    }
}
