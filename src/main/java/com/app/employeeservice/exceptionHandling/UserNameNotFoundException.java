package com.app.employeeservice.exceptionHandling;

public class UserNameNotFoundException extends RuntimeException{
    public UserNameNotFoundException(String message){
        super(message);
    }
}
