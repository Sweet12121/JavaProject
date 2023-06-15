package com.learnJava.Singleton;

public enum DataBase {

    // thread shafe - multithread

   INSTANCE;
   public void connect(){
       System.out.println("Connecting the DB");

   }
  public void disconnect(){
      System.out.println("disconnect the DB");
  }
}
