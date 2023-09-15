package com.kh.genericsMain;

// 제너릭 클래스 정의
public class Book<T> { // 제너릭 클래스 (모든 것을 포괄하겠다)
	T content; // 원래는 문자형인지 정수인지 실수인지 적지만 제너릭은 뭘 쓸지 적지 않는다.
	
	public void put(T item) {
		this.content = item;
	}
	
	public T get() {
		return content;
	}
}
