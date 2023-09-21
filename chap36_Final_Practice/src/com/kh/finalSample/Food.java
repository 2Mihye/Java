package com.kh.finalSample;

import java.io.Serializable;

public class Food implements Serializable{
	private String name;
	private int kcal; // 처음 세 줄 작성하고 Getter Setter 만들기
	
	public Food() {
		
	}
	public Food(String name, int kcal) {
		this.name = name;
		this.kcal = kcal;
		
	}

	public String getName() {
		return name;
	}
	public int getKcal() {
		return kcal;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setKcal(int kcal) {
		this.kcal = kcal;
	}
	
	@Override
	public String toString() {
		return name + kcal;
	}
	
}
