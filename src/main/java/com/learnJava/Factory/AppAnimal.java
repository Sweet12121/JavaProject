package com.learnJava.Factory;

public class AppAnimal {

    public static void main(String[] args){
        Animal animal = AnimalFactory.getAnimal(AnimalType.LION);
        animal.eat();
        Animal animal2 = AnimalFactory.getAnimal(AnimalType.TIGER);
        animal2.eat();
    }
}
