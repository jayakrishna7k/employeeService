package com.app.employeeservice.collections.list;

import java.util.Hashtable;

public class HashTableExample {
    public static void main(String[] args) {
        Hashtable<String,String> map=new Hashtable<>();
        map.put(null,"test");
        System.out.println(map);
    }
}

//thread  we will again discuss about hash table because its synchronized
