package com.yash.exception8;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class User 
{
	private static final String PATTERN =
            "((?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%]).(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%]).{8,16})";
    
    public static void main(String[] args) throws PasswordFormatException {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Please Enter Password to Set new Password.\n there should be 2 small and 2 capital Alpahabets \n2 Special characters \n2 numbers.");
        String password=sc.next();
        System.out.println("Password:- "+password);
        
        Pattern pattern = Pattern.compile(PATTERN);
        
        Matcher matcher = pattern.matcher(password);
        
        if(matcher.matches())
        {
              System.out.println("Password "+ password +" is valid");
              
          }
        else
        {
              System.out.println("Password "+ password +" is invalid");
              
              throw new PasswordFormatException("Password format is Invalid.");
          }
        
    }

}
