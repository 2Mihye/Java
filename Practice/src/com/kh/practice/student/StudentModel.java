package com.kh.practice.student;

public class StudentModel {
	private String name; // �̸�
	private String subject; // ����
	private int score; // ����
	
	public StudentModel(String name, String subject, int score) {
		this.name = name;
		this.subject = subject;
		this.score = score;
	}
	
	// Setter
	public void setName(String name) {
		this.name = name;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public void setScore(int score) {
		this.score = score;
	}
	
	// Getter
	public String getName() {
		return name;
	}
	public String getSubject() {
		return subject;
	}
	public int getScore() {
		return score;
	}
	
	public String inform() {
		return 
	}
	
}
