//package com.newray.greeting.controller;
//
//import java.util.List;
//
//
//
//
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.newray.greeting.dao.Printdetails;
//@RestController
//public class StudentDetails {
//	public int subid;
//	public String classnam;
//	public List<String> subjectname;
//	
//	public StudentDetails(int subid,String classnam) {
//		this.subid=subid;
//		this.classnam=classnam;
//		// TODO Auto-generated constructor stub
//	}
//	
//	public int getSubid() {
//		return subid;
//	}
//	public void setSubid(int subid) {
//		this.subid = subid;
//	}
//	public List<String> getSubjectname() {
//		return subjectname;
//	}
//	public void setSubjectname(List<String> subjectname) {
//		this.subjectname = subjectname;
//	}
//	public String getClassnam() {
//		return classnam;
//	}
//	public void setClassnam(String classnam) {
//		this.classnam = classnam;
//	}
//	
//	 @RequestMapping("/classname/{classname}")
//	  void Display(@PathVariable String classname)
//	 {
//	     
//		Printdetails p=new Printdetails();
//		p.Print(classname);
//
//	 }
//
//
//}
//
//
//	
//		  
//		  
//		  
//		   
//
//	
//
