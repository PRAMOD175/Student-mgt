package com.newray.greeting.model;

import java.util.List;

public class Student {
	
	private int subid;
	private String classnam;
	private  List<String> subjectname;
	
	
	public int getSubid() {
		return subid;
	}
	public void setSubid(int subid) {
		this.subid = subid;
	}
	public String getClassnam() {
		return classnam;
	}
	public void setClassnam(String classnam) {
		this.classnam = classnam;
	}
	public List<String> getSubjectname() {
		return subjectname;
	}
	public void setSubjectname(List<String> subjectname) {
		this.subjectname = subjectname;
	}
	
	

}
