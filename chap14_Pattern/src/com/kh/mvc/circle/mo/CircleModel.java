package com.kh.mvc.circle.mo;

public class CircleModel {
	private double number;
	
	public void setNumber(double number) {
		this.number = number;
	}
	
	public double circle() {
		return number * 3.14;
	}
}
