package com.app.employeeservice.exceptionHandling;

public class EmployeeService {

    public static String login (String username,String password){
       if(username.equals("admin") && password.equals("password123")){
           return "login sucessfull";
       }
       else{
         //throw new RuntimeException(); //pre defined exceptions
           throw new UserNameNotFoundException("User name or password doesn't match");
       }
    }
    public static String login1 (String username,String password){
        if(!username.equals("admin")){
            throw new UserNameNotFoundException("User name doesn't match");

        }
        if(!password.equals("password123")){
            // throw new RuntimeException(); //pre defined exceptions
            throw new UserNameNotFoundException("password doesn't match");
        }
        else{
            // throw new RuntimeException(); //pre defined exceptions
            return "login sucessfull";

        }
    }
    public static void main(String[] args) {
        System.out.println(login("admin","123"));
    }
}
