package com.learnJava.Singleton;

public class SingleObject {

    private static SingleObject instance = new SingleObject();

    private SingleObject(){

    }
    public static SingleObject getInstance(){
        return instance;
    }
    public  void showMessage(){
        System.out.println("Good luck ****");
    }

    public static void main(String[] args){

        SingleObject singleObject = SingleObject.getInstance();
        singleObject.showMessage();
    }
}

