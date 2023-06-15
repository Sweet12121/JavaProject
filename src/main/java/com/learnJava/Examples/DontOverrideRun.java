package com.learnJava.Examples;

public class DontOverrideRun {

    public static void main(String[] args) {

        System.out.println("main has started.");

        MyThread thread1 = new MyThread();

        thread1.start();

        System.out.println("main has ended.");
    }

}
