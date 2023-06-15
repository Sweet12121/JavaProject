package com.learnJava;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamDuplicate {

    public static void main(String[] args){

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 4, 3, 2, 6, 7, 8, 9, 10, 10);

        Map<Boolean, List<Integer>> result = numbers.stream()
                .collect(Collectors.partitioningBy(
                        i -> numbers.stream().filter(x -> x.equals(i)).count() > 1
                ));

        List<Integer> duplicates = result.get(true);
        List<Integer> originals = result.get(false);

        System.out.println("Duplicates: " + duplicates);
        System.out.println("Originals: " + originals);

    }
}
