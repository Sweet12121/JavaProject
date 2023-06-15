package com.learnJava.Singleton;

public class SingletonBreak {

    public static void main(String[] args){

        Singleton OrginalSingletonInstance = Singleton.getInstance();

        Singleton duplicateSingleton = Singleton.getInstance();

        System.out.println("Hash code  OrginalSingletonInstance : "+OrginalSingletonInstance.hashCode());
        System.out.println("Hash code  duplicateSingleton : "+duplicateSingleton.hashCode());
    }

}
