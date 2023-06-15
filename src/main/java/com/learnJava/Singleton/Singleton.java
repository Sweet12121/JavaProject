package com.learnJava.Singleton;

public class Singleton {

    private static Singleton singleton;

    private Singleton(){
        // To generate constructor stub
    }

    public static Singleton getInstance(){
        if(singleton == null){
            singleton = new Singleton();
        }
        return singleton;
    }
}
