package com.example.Employee_information2.entity;

import javax.annotation.Generated;

public class EmployeeInformation {
	

	
private Integer id;
	
	
	private String Name;
	
	private String status;
	
	private String from;
	
	private String to;
	
	private int age;

	public EmployeeInformation() {}
	
	public EmployeeInformation(Integer id, String name, String status, String from, String to, int i) {
		super();
		this.id = id;
		Name = name;
		this.status = status;
		this.from = from;
		this.to = to;
		this.age = i;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int i) {
		this.age = i;
	}

	@Override
	public String toString() {
		return "EmployeeInformation [id=" + id + ", Name=" + Name + ", status=" + status + ", from=" + from + ", to="
				+ to + ", age=" + age + "]";
	}
	
	
	


}
