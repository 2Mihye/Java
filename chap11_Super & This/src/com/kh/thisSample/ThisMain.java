package com.kh.thisSample;
/*
	�ν��Ͻ��� ��ü
��ü = �ν��Ͻ� �Ȱ��� �������� �޸� �������� ���� �ٸ�
this : �ν��Ͻ� �ڽ��� ����Ű�� ��������. �ν��Ͻ��� �ּҰ� ����Ǿ� ����.
		��ü(=�ν��Ͻ�) �ڽ��� ����Ű�� �������� ��ü�� �ּҰ� ������ ��.
this() : ���� Ŭ������ �ٸ� �����ڸ� ȣ���ϴµ� ���
		  
	�������� : ������ ���������� ���� �ʰ� �־��� ������ ��������
		  ex1) int x = 10; // ���� x�� 10�� �Ҷ�
			  int y = x; // �������� y. x�� ����Ų��.
		  ex2) x = 20;
		  	   System.out.println("y : " + y); // 10 // x�� ���� �ٲٰ��� y �ȿ� �ٽ� x�� �������� �ʾ����Ƿ� y�� ���� ������ �ʰ� 10��
		  ex3) int[] list1 = {1,2,3};
		  	   int[] list2 = list1;
		  	   
*/
class MyClass {
	int myField; // �տ� �⺻������ this.myField�� ���ִ� ����.
	// ù ��° ������
	MyClass() { //
		this(0); // this()�� ����Ͽ� �ٸ� ������ ȣ��
	}
	MyClass(int value){
		this.myField = value;
	}
	void printValue() {
		System.out.println("myField�� �� : " + this.myField);
	}
}
public class ThisMain {

	public static void main(String[] args) {
		MyClass obj1 = new MyClass(); // ù ��° ������ ȣ��
		MyClass obj2 = new MyClass(10); // �� ��° ������ ȣ��
		
		obj1.printValue();
		obj2.printValue();
	}

}
