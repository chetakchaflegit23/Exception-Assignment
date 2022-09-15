package com.yash.exception3;

import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class TryWithResourses {

	public static void main(String[] args) throws IOException
	{
		  FileWriter fw = new FileWriter("D:\\abc.txt");
	        FileInputStream file = new FileInputStream("D:\\abc.txt");
	        Scanner sc = new Scanner(file);
	        try {
	            fw.write("Welcome to  Pune ");

	            while(sc.hasNextLine()) {
	                System.out.println(sc.nextLine());
	            }
	        }catch(Exception e) {
	            System.out.println(e);
	            System.out.println("Success");
	        }finally {
	            fw.close();
	            file.close();
	            sc.close();
	        }
	        
	        System.out.println("Resource are closed and message has been written into the abc.txt");
	}
}
