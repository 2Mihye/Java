package com.kh.superSample;

public class SuperMain {

	public static void main(String[] args) {
		Child child1 = new Child();
		
		Child child2 = new Child("둘리");
		child2.display(); // super.display(); 했을 때 어떻게 되는지, 사용하고 싶다면 어떻게 해야 하는지!
	}

}
