package com.newray.student.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.newray.student.StudentdetailRepository;
import com.newray.student.entity.Studentdetail;
@RestController
public class StudentControler {
	
	@Autowired
	StudentdetailRepository studentdetailRepository;
//	@GetMapping(value="/getStudentdetailjson")
//	public Student getStudent()
//	{
//		
//		Student student = new Student();
//		student.setClassnam("mca");
//		student.setSubid(100);
//
//	 

//	 
//	 
//	 
//		return student;
//	}
//	@RequestMapping(value="/getStudentdetails",method =RequestMethod.POST)
//	public Student getStudent(@RequestBody Student detail)
//	{
//		return detail;
//	}
	@GetMapping(value="/Studentdetail")
	public Iterable<Studentdetail> getStudentDetails()
	{
		return studentdetailRepository.findAll();
	}

}
