package com.learnJava.Examples;

import java.util.Arrays;

public class WordLength {
    public static void main(String[] args) {
        String sentence = "java teach me";
        String[] words = sentence.split(" ");

        Arrays.stream(words)
                .mapToInt(String::length)
                .forEach(length -> System.out.println("Word length: " + length));
    }
}
