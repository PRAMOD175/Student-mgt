package com.newray.collection;

public class Exceptiohandling {
public static void main(String args[])
{
	try {
		
	
	String name="";
	int num1=8/0;
	int a[]=new int [10];
	a[15]=10;
	System.out.println("String"+name);
	System.out.println("num1="+num1);
	
	System.out.println("a="+a[15]);
	}
	catch(ArithmeticException e)
	{
		System.out.println("Arithemetic exception");
	}
	catch(ArrayIndexOutOfBoundsException e)
	{
		System.out.println("arrayoutof bound exception");
	}
	catch(NullPointerException e)
	{
		System.out.println("null exception");
	}
	catch(RuntimeException e)
	{
		System.out.println("null exception");
	}
	catch(Exception e) {
		System.out.println("exception occurs");
	}
	
	
}
}
