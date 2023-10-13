package com.app.employeeservice.collections.list;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample {

    //1.TreeMap don't allows  null as key
    //2.TreeMap allows multiple null values
    //3.TreeMap will give sorting order(asce)
    //4.Tree Map allows unique elements
    public static void main(String[] args) {

        Map<Integer,String> namesMap=new TreeMap<>();
        namesMap.put(null,"Jaya");
        namesMap.put(2,"Indu priya");
        namesMap.put(3,"vyshnavi");
        namesMap.put(4,null);
        namesMap.put(5,null);

        Map<String,Integer> namesIdMap=new TreeMap<>();
        namesIdMap.put("Jaya",1);
        namesIdMap.put("Indu priya",2);
        namesIdMap.put("vyshnavi",3);

        Map<String,String> categoryMap=new TreeMap<>();
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
