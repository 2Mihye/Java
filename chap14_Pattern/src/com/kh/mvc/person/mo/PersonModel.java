package com.kh.mvc.person.mo;

public class PersonModel {
	private String name;
	// 무결성 추가하기 : 만약에 이름이 빈칸이면 빈칸입니다. 출력하기
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void isValidName() {
		// 만약에 이름이 안 적혀있다면 안들어왔다 혹은 this.name = 0; 출력
		if(this.name == "") {
			this.name = "빈칸입니다.";
		}
	}
	
	public String info() {
		return name;
	}
}