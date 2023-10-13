package com.app.employeeservice.collections.set;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample {

    public static void main(String args[]){
        HashSet<String> names=new HashSet<>();
        names.add("jaya");
        names.add("krishna");
        names.add("indu priya");
        names.add("vyshnavi");
        names.add("krishna");
        names.add("indu priya");
        names.add("krishna");
        names.add("indu priya");


       /* for(String name:names){
            if(name.equals("krishna") || name.equals("vyshnavi")) {
                System.out.println(name);
            }
            else{
                System.out.println("no match");
            }
        }*/


        for(String name:names){
            System.out.println(name);

        }

    }
}
