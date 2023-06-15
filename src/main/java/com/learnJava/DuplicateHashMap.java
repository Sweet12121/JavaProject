package com.learnJava;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class DuplicateHashMap {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 4, 3, 2, 6, 7, 8, 9, 10, 10);

        Map<Integer, Integer> frequencyMap = new HashMap<>();

        List<Integer> duplicates = numbers.stream()
                .filter(i -> frequencyMap.compute(i, (k, v) -> (v == null) ? 1 : v + 1) > 1)
                .collect(Collectors.toList());

        System.out.println("Duplicates: " + duplicates);
        System.out.println("Duplicates: " + frequencyMap);
    }
}