package com.app.employeeservice.collections.list;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapExample {
    //1.LinkedHashMap allows one null as key
    //2.LinkedHashMap allows multiple null values
    //3.Will not allow duplicate keys
    //4.LinkedHashMap will give insertion order
    public static void main(String[] args) {

        Map<Integer,String> namesMap=new LinkedHashMap<>();
        namesMap.put(null,"Jaya");
        namesMap.put(null,"Indu priya");
        namesMap.put(3,"vyshnavi");
        namesMap.put(4,null);
        namesMap.put(5,null);

        Map<String,Integer> namesIdMap=new LinkedHashMap<>();
        namesIdMap.put("Jaya",1);
        namesIdMap.put("Indu priya",2);
        namesIdMap.put("vyshnavi",3);

        Map<String,String> categoryMap=new LinkedHashMap<>();
        categoryMap.put("movie","tollywood");
        categoryMap.put("sports","indian sports");
        categoryMap.put("politics","indian politics");
        categoryMap.put("politics","indian politics 1");
        categoryMap.put("politics","indian politics 2");


        System.out.println(namesMap);
        System.out.println(namesMap.get(0));
        System.out.println(namesMap.get(1));
        System.out.println(namesMap.get(2));
        System.out.println(namesMap.get(3));

        System.out.println(namesIdMap.get("jaya"));
        System.out.println(namesIdMap.get("indu priya"));
        System.out.println(namesIdMap.get("vyshnavi"));
        System.out.println(categoryMap);

    }
}
