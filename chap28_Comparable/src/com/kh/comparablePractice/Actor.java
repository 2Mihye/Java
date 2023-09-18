package com.kh.comparablePractice;

import java.util.ArrayList;
import java.util.List;

public class Actor implements Comparable<Actor>{
	private String name;
	private int age;
	
	public Actor (String name, int age) {
		this.name = name;
		this.age = age;		
	}
	
	@Override
	public int compareTo(Actor otherActor) {
		return this.age - otherActor.age;
	}
	
	@Override
	public String toString() {
		return "Actor age : " + age + ", name : " + name;
	}
	
	public static void main(String[] args) {
		List<Actor> actors = new ArrayList<>();
		actors.add(new Actor ("김우빈", 34));
		actors.add(new Actor ("강동원", 42));
		actors.add(new Actor ("최우식", 33));
		
		for(Actor actor : actors) { // 나이를 기준으로 정렬
			System.out.println(actor);
		}
	}
	
}
