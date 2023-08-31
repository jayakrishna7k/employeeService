package com.app.employeeservice.service;

import org.springframework.beans.factory.annotation.Autowired;

public class Company extends Employee {

    //single -> company extends Employee
    //Multilevel Inheritance -->      project   extends   company extends employee
    //hierachical Inheritance --> company -> employee,project -> employee
    //Multiple Inheritance --> project extends employee,company (which is not possible with clasees in java)
    //Hybrid Inheritance -> company -> employee and project extends employee and employee extends organization

    @Override
    public String getEmployeeBackGroundDetails(){
        return "Negative";
    }

    public String getEmpDetails(){
        return "Test Details";
    }
    public static void main(String args[]) {
        Company cmp=new Company();
        System.out.println(cmp.getEmployeeBackGroundDetails());

        Organization org=new Organization();
        org.setId(1);
        org.setName("Jaya");
        org.setPhone("123456789");
        System.out.println(org.getId());
        System.out.println(org.getName());
        System.out.println(org.getPhone());
        System.out.println(cmp.add(1,2));

    }
    //Method OverLoading
    public int add(int a,int b){
       return a+b;
    }
    public int add(int a,int b,int c){
        return a+b+c;
    }
    public long add(long c,long d){
        return c+d ;
    }
   /* public void add(int a,int b){
        System.out.println(a+b);
    }*/
    public String add(String name){
      return name;
    }


}