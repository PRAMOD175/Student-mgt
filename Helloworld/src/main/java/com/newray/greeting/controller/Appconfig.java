package com.newray.greeting.controller;


import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Appconfig {
	
	@RequestMapping("/hello")
	public String hello()
	{
		return "Hello world!........";
	}
//	@RequestMapping("/add/{id}/{id2}")
//	 int add(@PathVariable int id ,@PathVariable int id2)
//	{
//		
//		return id+id2;
//		
//	}
//	@RequestMapping(value="/sub/{id}/{id2}", method= RequestMethod.GET)
//	 int sub(@PathVariable int id ,@PathVariable int id2)
//	{
//		
//		return id-id2;
//		
//	}
//	@RequestMapping("/div/{id}/{id2}")
//	int div(@PathVariable int id,@PathVariable int id2)
//	{
//		return id/id2;
//	}
//	@RequestMapping("/mul/{id}/{id2}")
//	int mul(@PathVariable int id,@PathVariable int id2)
//	{
//		return id*id2;
//	}
//	
//	@RequestMapping(value = "/getStudentDetailsJSON", method= RequestMethod.GET)
//	public com.newray.greeting.model.StudenDetails getStudentDetails()
//	{
//		return new com.newray.greeting.model.StudenDetails();
//	}
//	
//	@RequestMapping(value = "/getStudentDetails", method= RequestMethod.POST)
//	public String getStudentDetails(@RequestBody com.newray.greeting.model.StudenDetails details)
//	{
//		return "";
//	}
//
}
