package com.learnJava.Singleton;

public class DatabaseConnector {

    //Eager loading
    private static DatabaseConnector INSTANCE = new DatabaseConnector();

    private DatabaseConnector(){

    }

    public static DatabaseConnector getInstance(){

        if(INSTANCE == null){
            // if multi thread will try to access.

            // To slow 100X slower then other
            synchronized (DatabaseConnector.class){
                INSTANCE = new DatabaseConnector();
            }
        }

        return INSTANCE;
    }

    public void connect(){
        System.out.println("Connecting the Database");
    }
    public void disconnect(){
        System.out.println("Dis -Connecting the Database");
    }
}
