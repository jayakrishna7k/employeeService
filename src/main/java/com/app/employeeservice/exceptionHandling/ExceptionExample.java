package com.app.employeeservice.exceptionHandling;

import java.io.IOException;

public class ExceptionExample {
    public static void main(String[] args) {
        //IOException
      // NullPointerException
        System.out.println(1);
        System.out.println(2);

        //checked exceptions(compile time exceptions)
        //the exceptions which extends Throwable class except Runtime Exception and Error are known as checked exception.
        //uncheck exceptions:(run time exceptions)
        //the exceptions which extends RuntimeException is called unchecked exceptions arthematic,null pointer etc.
        //error : irrecoverlable
        //Exception handlinmg keywords
        //try
        //catch
        //finally
        //throw
        //throws

        try {
            System.out.println(1 / 0);
        }
        catch(Exception e){
            // we can supress the exception
            // throw the exception by beautifying error classes
            System.out.println("catch block excecuted");

        }
        finally{
            System.out.println("finally block excecuted");
        }
        System.out.println("connection closed");
        System.out.println(4);
        System.out.println(6);
        System.out.println(0 / 1);
        System.out.println(1 / 1);
    }
}
