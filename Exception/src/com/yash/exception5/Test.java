package com.yash.exception5;

import java.time.LocalTime;
import java.util.Scanner;

public class Test {
	public static void main(String[] args) throws wronginput {
	    
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Which type of Booking u want Do");
	    System.out.println("Press 1 for Normal Booking");
	    System.out.println("Press 2 for Tatkal Booking");
	     
	    int n=sc.nextInt();
	    if(n==1)
	    {
	        System.out.println("Normal Booking");
	        
	        System.out.println("How many booking u want to do ");
	        int a=sc.nextInt();
	        if(a<=6)
	        {
	            for(int i=0; i<=a ; i++)
	            {
	            System.out.println("Enter Name of Passanger");
	            String name=sc.next();
	            System.out.println("Enter the Address of passanger");
	            String addr=sc.next();
	            
	            System.out.println("Enter the Mobile No of passanger");
	            long num=sc.nextLong();
	            
	              Booking b=new Booking();
	              b.setName(name);
	              b.setAddreess(addr);
	              b.setMobileno(num);
	              System.out.println(b.getName());
	              System.out.println(b.getAddreess());
	              System.out.println(b.getMobileno());
	              
	              break;
	              
	            }
	            
	         
	        }
	        else
	        {
	            throw new wronginput("NormalTicketBookingException");
	        }
	    }
	    else if(n==2)
	    {
	        System.out.println("Tatkal Booking");
	        if(LocalTime.now().getHour()> 10&& LocalTime.now().getHour()<12)
	        {
	            
	        }
	        
	    
	        
	    }
	    else
	    {
	        System.out.println("Please Provide Coorect Input");
	    }
	    
	}
}
