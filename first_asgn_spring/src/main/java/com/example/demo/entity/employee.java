package com.example.demo.entity;

public class employee {
	private int id;
	private String name;
	private String dept;
	public employee( String name, String dept) {
		super();
		this.name = name;
		this.dept = dept;
	}
	public employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
