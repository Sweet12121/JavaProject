package com.learnJava.defaultsEswari;

import java.util.*;
import java.util.stream.Collectors;
import static java.util.Locale.filter;

public class Duplicate {
    public static void main(String[] args){

        Integer[] number = new Integer[]{5,6,6,2,3,1,1};
        Set<Integer> allItems = new HashSet<>();
        Set<Integer> duplicate = Arrays.stream(number)
                .filter(n -> !allItems.add(n))
                .collect(Collectors.toSet());
        System.out.println(duplicate);
        System.out.println(allItems);

    }

    class dup{
    public static void main(String[] args){

        Integer[] number = new Integer[]{4,4,2,1,8,5,5};
        HashSet<Integer> allno = new HashSet<>();

        Set<Integer> duplicate = Arrays.stream(number)
                              .filter(n -> !allno.add(n))
                                     .collect(Collectors.toSet());

        System.out.println("duplicated:" +duplicate);

    }
}

}
