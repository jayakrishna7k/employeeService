package com.app.employeeservice.collections.set;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class LinkedHasSetExample {

    public static void main(String args[]){
        LinkedHashSet<String> names=new LinkedHashSet<>();
        LinkedHashSet<Integer> numbers=new LinkedHashSet<>();

        names.add("jaya");
        names.add("krishna");
        names.add("indu priya");
        names.add("vyshnavi");

        names.add("krishna");
        names.add("indu priya");
        names.add("krishna");
        names.add("indu priya");
        System.out.println(names);
        System.out.println(names.contains("krishna"));

        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(7);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        System.out.println(numbers);
    }
}
