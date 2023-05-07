package com.learnJava.defaultsEswari;

public class Main {
    public static void main(String[] args) {
        int result = new Abstractexample() {
            @Override
            int multiply(int a, int b) {
                return a * b;
            }
        }.multiply(10, 20);

        System.out.println("Result :" + result);
    }
}
