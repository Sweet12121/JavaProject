/*
package com.learnJava.BuilderPattern;

import groovy.transform.builder.Builder;

@Builder

public class Person {

    private String name;

    public Person(String name, String email, String address, String age) {
        this.name = name;
        this.email = email;
        this.address = address;
        this.age = age;
    }

    private String email;
    private String address;
    private String age;


    public Person Builder() {
        this.name = Builder().name;
        this.age = Builder().age;
        this.address = Builder().address;
        this.email = Builder().email;
    }

    public String setAge(String age){
        this.age = age;
      return age;
    }
    public  Builder setAddress(String address){
        this.address = address;

    }

}
*/
