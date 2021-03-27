package com.newray.collection;

import java.io.IOException;

public class Calculator {
	public int value1;
	public int value2;
	
	 void addition() 
	 {
		 System.out.println("addition of"+value1+"and"+value2+"="+ (value1+value2));
	 }
	  void multiplication()
	 {
		System.out.println("multiplication of"+value1+"and"+value2+"="+value1*value2);
	 }
	 void substraction()
	 {
		 System.out.println("substraction of"+value1+"and"+value2+"="+ (value1-value2));
	 }
	 void division() throws Exception
	 {
//		 System.out.println("division of"+value1+"and"+value2+"="+(value1/value2));
		Advanced c1= new Advanced();
		c1.square();
		c1.square1();
		
	 }
	 

}

