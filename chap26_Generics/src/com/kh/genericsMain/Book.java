package com.kh.genericsMain;

// ���ʸ� Ŭ���� ����
// T type�� ���� t ��� �ְ���� �ڸ����� �־ �ȴ�.
public class Book<T> { // ���ʸ� Ŭ���� (��� ���� �����ϰڴ�)
	T content; // ������ ���������� �������� �Ǽ����� ������ ���ʸ��� �� ���� ���� �ʴ´�.
	
	public void put(T item) {
		this.content = item;
	}
	
	public T get() {
		return content;
	}
}
