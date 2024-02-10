package com.example.demo.model;

public class postrequestmodel {
	private String name;
	private String dept;
	public postrequestmodel(String name, String dept) {
		super();
		this.name = name;
		this.dept = dept;
	}
	public postrequestmodel() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	
}
