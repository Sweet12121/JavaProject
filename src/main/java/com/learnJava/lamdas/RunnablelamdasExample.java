package com.learnJava.lamdas;

public class RunnablelamdasExample {
    public static void main(String[] args) {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Inside Runnable 1");
            }
        };
        new Thread(runnable).start();
        //lamdas

        Runnable runnablelamdas = () -> {
            System.out.println("Inside Runnable 2");
        };
        new Thread(runnablelamdas).start();
    }

}
