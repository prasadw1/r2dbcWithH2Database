package com.sample.r2dbc.model;

import org.springframework.data.annotation.Id;

public class User {
	
	@Id
	private Integer id;
	
	private String name;
	
	private Integer salary;

	public User(String name, Integer salary) {
		this.name = name;
		this.salary = salary;
	}
	
	public User() {
		
	}
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
	  public Integer getSalary() { return salary; }
	  
	  public void setSalary(Integer salary) { this.salary = salary; }
	 
	
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", salary="  + salary + "]";
	}

}
