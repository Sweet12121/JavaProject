package com.learnJava.defaultsEswari;

public class Bike {
    void run(){
        System.out.println("Running bike");
    }
}
class Splendor extends Bike{
    void run(){
        System.out.println("Splendor run fast");
    }

    public static void main(String[] args){
        Bike b = new Splendor();
        b.run();
    }
}
// Run time polymorphism - Method overloading
