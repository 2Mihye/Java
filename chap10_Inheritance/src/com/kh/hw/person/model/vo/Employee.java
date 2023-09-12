package com.kh.hw.person.model.vo;

public class Employee {
	private int salary;
	private String dept;
	

	// Setter
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	
	// Getter
	public int getSalary() {
		return salary;
	}
	public String getDept() {
		return dept;
	}



	public Employee(int salary, String dept) {		
		this.salary = salary;
		this.dept = dept;
	}
	
	
}
