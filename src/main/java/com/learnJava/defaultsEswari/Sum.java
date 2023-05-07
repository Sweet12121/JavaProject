package com.learnJava.defaultsEswari;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;

public class Sum {



        public static void main(String[] args){

            List<Integer> number = Arrays.asList(5,4,4,40,50);

            IntSummaryStatistics stats = number.stream()
                                         .mapToInt((x) -> x).summaryStatistics();

            System.out.println("Summ: " +stats.getSum());

        }
    }

