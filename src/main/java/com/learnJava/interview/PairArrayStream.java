package com.learnJava.interview;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.stream.IntStream;

public class PairArrayStream {
    public static void main(String[] args) {
        int k =1;
        List<Integer> input = Arrays.asList(1,1,1,2);
        HashSet<HashSet> hs = new HashSet<HashSet>();
        IntStream.range(0,  input.size())
                .forEach(i -> IntStream.range(0,  input.size())
                        .filter(j -> i != j && input.get(i) - input.get(j) == k)
                        .forEach(j -> {
                            HashSet inner = new HashSet<>();
                            inner.add(input.get(j));
                            inner.add(input.get(i));
                            hs.add(inner);
                        })
                );
        System.out.println("OutPut "+hs.size());
    }
}
