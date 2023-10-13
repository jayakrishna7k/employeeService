package com.app.employeeservice.collections.list;

import java.util.*;

public class HashMapExample {
    //map is collection where we can store key value pairs for example employe name with employee id etc...
    //1.Hashmap allows one null as key
    //2.Hashmap allows many null values
    //3.map will not allow duplicate keys
    //4.Hashmap will not give insertion order
    public static void main(String[] args) {
        Map<Integer,String> namesMap=new HashMap<>();
       // Map<Integer, List<String>>  namesMap=new HashMap<>();
        namesMap.put(null,"Jaya");
        namesMap.put(null,"Indu priya");
        namesMap.put(3,"vyshnavi");
        namesMap.put(3,"vyshnavi new");

        namesMap.put(4,null);
        namesMap.put(5,null);
        namesMap.put(6,null);
        namesMap.put(7,null);
        namesMap.put(8,null);


        Map<String,Integer> namesIdMap=new HashMap<>();
        namesIdMap.put("Jaya",1);
        namesIdMap.put("Indu priya",2);
        namesIdMap.put("vyshnavi",3);

        Map<String,String> categoryMap=new HashMap<>();
        categoryMap.put("movie","tollywood");
        categoryMap.put("sports","indian sports");
        categoryMap.put("politics","indian politics");

        System.out.println(namesMap);
        System.out.println(namesMap.get(0));
        System.out.println(namesMap.get(1));
        System.out.println(namesMap.get(2));
        System.out.println(namesMap.get(3));

        System.out.println(namesIdMap.get("jaya"));
        System.out.println(namesIdMap.get("indu priya"));
        System.out.println(namesIdMap.get("vyshnavi"));

    }
}
