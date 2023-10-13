package com.app.employeeservice.collections.list;

public class UseCases {
    public static void main(String[] args) {
        System.out.println(login("admin","123456"));
        System.out.println(login("jaya","123456"));
        System.out.println(login("test","test"));


    }

   /* public static boolean login(String userName,String password){
       if(userName.equals("admin") && password.equals("123456")){
           return true;
       }
        return false;
    }*/


   public static String login(String userName, String password) {

       if(userName.equals("admin") || password.equals("123456")){
           return "Login Success";
       }
       return "Login Failed";

   }

    /*public int login(String userName, String password) {
        return 1;
    }*/
}
