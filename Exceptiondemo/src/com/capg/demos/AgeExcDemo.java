package com.capg.demos;

import java.util.Scanner;

public class AgeExcDemo {
	 
	 public static void main(String[] args) {
	  Scanner s = new Scanner(System.in);
	  System.out.print("Enter ur age : ");
	  int age = s.nextInt();
	  
	  try {
	   if(age <= 15) 
	    throw new AgeException("Age cannot be less than or equal to 15");
	   else
	    System.out.println("Valid age");
	  }
	  catch (AgeException a) {
	System.err.println("Error..."+a.getMessage());
	  }
	 }
	}
