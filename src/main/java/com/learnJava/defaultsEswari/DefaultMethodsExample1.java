package com.learnJava.defaultsEswari;

import java.util.*;
import java.util.Comparator;
import java.util.List;

public class DefaultMethodsExample1 {

    public static void main(String[] args){
        List<String> stringList = Arrays.asList("Adam","Murugan","Siva","Karthika","Nandu","Amma","Lakshmi");

        /*Collections.sort(stringList);
        System.out.println("Sorted List old java :" + stringList);
        Collections.reverse(stringList);
        System.out.println("Sorted List old java reverse :" + stringList);*/

        stringList.sort(Comparator.naturalOrder());

        System.out.println("Sorted list : " +  stringList);

        stringList.sort(Comparator.reverseOrder());

        System.out.println("Reverse Sorted list : " +  stringList);


    }
}
