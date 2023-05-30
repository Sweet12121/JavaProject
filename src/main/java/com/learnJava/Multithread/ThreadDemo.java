package com.learnJava.Multithread;

public class ThreadDemo {


    public static void main(String[] args) {

        Hi obj1 = new Hi();
        Hello obj2 = new Hello();
        obj1.start();
        obj2.start();


    }

 static class Hi extends Thread {
        public void show(){

            for(int i=1;i<=5;i++){
                System.out.println("Say HIIII");
            }
        }
    }
   static class Hello extends Thread {
        public void show() {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Say Hello");

            }
        }


    }
}
