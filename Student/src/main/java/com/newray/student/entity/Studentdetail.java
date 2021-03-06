package com.newray.student.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.boot.autoconfigure.domain.EntityScan;

@EntityScan
@Entity
@Table(name="Studentdetail")
public class Studentdetail implements Serializable{


	//private static final long serialVersionUID = -3411601784608511786L;
	@Id
	//@GeneratedValue(strategy = GenerationType.IDENTITY)
//	@Column(name="sid")
	private Integer sid;
//	@Column(name="sname")
	private String sname;
	
//	@Column(name="sclass")
	private String sclass;
	
//	@Column(name="subname")
	private String subname;
	
	
	public Integer getSid() {
		return sid;
	}

	public void setSid(Integer sid) {
		this.sid = sid;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public String getSclass() {
		return sclass;
	}

	public void setSclass(String sclass) {
		this.sclass = sclass;
	}

	public String getSubname() {
		return subname;
	}

	public void setSubname(String subname) {
		this.subname = subname;
	}


	
	

}
