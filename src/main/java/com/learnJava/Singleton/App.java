package com.learnJava.Singleton;

public class App {

    public static void main(String[] args){

       /* DatabaseConnector.getInstance().connect();

        DatabaseConnector.getInstance().disconnect();*/

        DataBase.INSTANCE.connect();
        DataBase.INSTANCE.disconnect();
     DataBase o1 = DataBase.INSTANCE;
        DataBase o2 = DataBase.INSTANCE;

    if(o1 == o2){
        System.out.println("Both object are same");
    }
    }
}
