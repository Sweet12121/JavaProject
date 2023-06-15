package com.learnJava;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class Distinct {

    public static void main(String[] args){
        Collection<String> list = Arrays.asList("A", "B", "C", "D", "A", "B", "C");
// Distinct is used to indentify unique element in the map

        List<String> distinctChars = list.stream()
                .distinct()
                .collect(Collectors.toList());
        System.out.println("Distint output :" +distinctChars);
    }
}
