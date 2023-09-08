package com.kh.mvc.person.mo;

public class PersonModel {
	private String name;
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String info() {
		return name;
	}
}