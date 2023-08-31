package com.app.employeeservice.service;

public class Organization {
    private int id;
    private String name;
    private String phone;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPromoValue(String value){
      return value;
    }

    public String sayHi(String value){
        return value;
    }
}
