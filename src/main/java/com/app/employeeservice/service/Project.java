package com.app.employeeservice.service;

public class Project extends Company{


    public String getEmployeeBackGroundDetails(){
        return "Negative";
    }


    public static void main(String args[]){

        Project pro=new Project();
        System.out.println(pro.getEmployeeBackGroundDetails());
        System.out.println(pro.value);

    }




}
