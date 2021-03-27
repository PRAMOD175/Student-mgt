package com.newray.collection;

import java.util.Scanner;



public class Drivercal {
	public static void main(String[] args) throws Exception 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter two values");
		int value1=sc.nextInt();
		int value2=sc.nextInt();
		Advanced Advancobj=new Advanced(value1,value2);
		Advancobj.addition();
		Advancobj.multiplication();
		Advancobj.substraction();
		
		Advancobj.division();
		Advancobj.square1();
		
		try {
			
			Advancobj.division();
			Advancobj.square();
		
	
		}
		catch (ArithmeticException e)
		{
	
			System.out.println("Arithmetic error");
			
		}
		catch(ArrayIndexOutOfBoundsException e) {
			
			System.out.println("Array out of bound");
		
			
		}
		catch(RuntimeException e)
		{
			System.out.println("Runtime error");
		}
	
		
	}

}
