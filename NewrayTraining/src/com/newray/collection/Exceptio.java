package com.newray.collection;

public class Exceptio {
	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		   try{    
//			    int a[]=new int[5];    
//			    a[5]=30/0;    
//			   }   
//		       catch(ArithmeticException e){System.out.println("task1 is completed");}    
//		       catch(RuntimeException e){System.out.println("task 2 completed");}   
//			   catch(Exception e){System.out.println("common task completed");}    
//			  
//			   System.out.println("rest of the code...");   
	       try{    
               int a[]=new int[5];    
             //  a[5]=30/0;    
               System.out.println(a[10]);  
              }    
//              catch(ArithmeticException e)  
//                 {  
//                  System.out.println("Arithmetic Exception occurs");  
//                 }    
//              catch(ArrayIndexOutOfBoundsException e)  
//                 {  
//                  System.out.println("ArrayIndexOutOfBounds Exception occurs");  
//                 }  
//	       catch (RuntimeException e) {
//	    	   System.out.println("runtime  Exception occurs");
//			// TODO: handle exception
//		}
              catch(Exception e)  
                 {  
                  System.out.println("Parent Exception occurs");  
                 }             
              System.out.println("rest of the code");    
   }  

			 }    
			


