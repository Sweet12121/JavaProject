package com.learnJava.Examples;

import java.util.*;

public class RemoveDuplicate1 {

    public static void main(String[] args){

       List<Integer> inputValue = Arrays.asList(1,2,3,3,3,3,4,5,8,6,6);


        Set<Integer> unqiueValue  = new LinkedHashSet<>(inputValue);
        List<Integer> valuewithoutduplicates = new ArrayList<>(unqiueValue);

        System.out.println(" With  duplicated :" +inputValue);
        System.out.println(" With out duplicated :" +valuewithoutduplicates);
    }
}
