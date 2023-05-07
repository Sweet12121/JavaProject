package com.learnJava.arrayList;

public class ThreadExample extends Thread{
  public static void main(String[] args){
      ThreadExample threadExample = new ThreadExample();
      threadExample.start();
      System.out.println("This is the thread running outside ");
  }
    public void run(){
        System.out.println("This code is running in a thread");
    }

}
