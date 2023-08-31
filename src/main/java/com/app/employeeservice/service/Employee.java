package com.app.employeeservice.service;
//parent
public class Employee extends Organization {
     int id;
     String name;
     String phone;
String value="Test Value";
    public int getEmployeeId(){
        System.out.println(id);
        return id;
    }

    public String getEmployeeBackGroundDetails(){
        return "Positive";
    }

    public static void main(String args[]){
        Employee emp=new Employee();
        Organization org=new Employee();//upcasting
        Project proj=new Project();
        Project proj1=new Project();
        System.out.println(proj1.getEmployeeBackGroundDetails());
        System.out.println(proj.getEmployeeBackGroundDetails());
        System.out.println( getPromoValues("FREE Prod 1+1"));
        System.out.println( org.sayHi("Hi Welcome"));
    }
    public String getPromoValue(String value){
        return value+"+2";
    }
    public static String getPromoValues(String value){
        return value+"+2";
    }

}
