package com.kh.thisSample;
/*
	인스턴스와 객체
객체 = 인스턴스 똑같은 말이지만 메모리 영역에서 조금 다름
this : 인스턴스 자신을 가리키는 참조변수. 인스턴스의 주소가 저장되어 있음.
		객체(=인스턴스) 자신을 가리키는 참조변수 객체의 주소가 저장이 됨.
this() : 현재 클래스의 다른 생성자를 호출하는데 사용
		  
	참조변수 : 뭔가를 직접적으로 넣지 않고 넣어진 변수가 참조변수
		  ex1) int x = 10; // 정수 x를 10값 할랑
			  int y = x; // 참조변수 y. x를 가리킨다.
		  ex2) x = 20;
		  	   System.out.println("y : " + y); // 10 // x의 값을 바꾸고나서 y 안에 다시 x를 대입하지 않았으므로 y의 값은 변하지 않고 10임
		  ex3) int[] list1 = {1,2,3};
		  	   int[] list2 = list1;
		  	   
*/
class MyClass {
	int myField; // 앞에 기본적으로 this.myField가 써있는 것임.
	// 첫 번째 생성자
	MyClass() { //
		this(0); // this()를 사용하여 다른 생성자 호출
	}
	MyClass(int value){
		this.myField = value;
	}
	void printValue() {
		System.out.println("myField의 값 : " + this.myField);
	}
}
public class ThisMain {

	public static void main(String[] args) {
		MyClass obj1 = new MyClass(); // 첫 번째 생성자 호출
		MyClass obj2 = new MyClass(10); // 두 번째 생성자 호출
		
		obj1.printValue();
		obj2.printValue();
	}

}
