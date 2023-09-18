package com.kh.comparablePractice;

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
		return "Actor name : " + name + ", age : " + age;
	}
	
}
