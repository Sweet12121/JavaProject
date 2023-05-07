package com.learnJava.arrayList;

import java.util.HashMap;

public class HashMapEx1 {

    public static void main(String[] arg){
    HashMap<String, String> capitalCities = new HashMap<String, String>();
    capitalCities.put("England","LOndon");
    capitalCities.put("TamilNadu","India");
    System.out.println(capitalCities);
       String size = String.valueOf(capitalCities.size());
       System.out.println(size);

}

}
