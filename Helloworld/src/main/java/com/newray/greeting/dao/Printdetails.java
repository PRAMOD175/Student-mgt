//package com.newray.greeting.dao;
//import java.util.ArrayList;
//import java.util.List;
//
//
//import org.springframework.web.bind.annotation.PathVariable;
//
//import com.newray.greeting.controller.StudentDetails;
//
//public class Printdetails
//{
//	
//	private String classname;
//	
//
//	public List<String> Print(String classname)
//	{
//		this.classname=classname;
//		 StudentDetails studentobj=new StudentDetails(100, "mca");
//		  StudentDetails studentobj1=new StudentDetails(101, "bca");
//		  StudentDetails studentobj2=new StudentDetails(102, "mba");
//		  StudentDetails studentobj3=new StudentDetails(103, "msc");
//		 
//		   List<String> subList = new ArrayList<String>();
//		     subList.add("mca");
//		     subList.add("Java");
//		     studentobj.setSubjectname(subList);
//		     
//		     subList=new ArrayList<String>();
//		     subList.add("c++");
//		     subList.add("c#");
//		     studentobj1.setSubjectname(subList);
//		     subList=new ArrayList<String>();
//		     subList.add("accounts");
//		     subList.add("business");
//		     studentobj2.setSubjectname(subList);
//		     subList=new ArrayList<String>();
//		     subList.add("chemistry");
//		     subList.add("biology");
//		     studentobj3.setSubjectname(subList);
//		     
//		   ArrayList<StudentDetails>lista=new ArrayList<StudentDetails>();
//		     {
//		    	 lista.add(studentobj);
//		    	 lista.add(studentobj1);
//		    	 lista.add(studentobj2);
//		    	 lista.add(studentobj3);
//		    	
//		    	 
//		     }
//		    
//		     
//		 	for(StudentDetails c:lista)
//		    {
//		   	 
//			if(c.classnam.equals(classname))
//		   	 {
//		   		return c.subjectname; 
//		   		
//		   	 }
//		    }
//			return subList;  	
//		 
//		 	
//	
//
//
//}
//}
