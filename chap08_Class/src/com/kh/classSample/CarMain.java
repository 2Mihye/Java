package com.kh.classSample;

public class CarMain {

	public static void main(String[] args) {
		//public Car(String brand, String model)
			   //public Car(String brand, String model);
		Car myCar = new Car("Toyota","Carmy"); // Scanner�� ����ϰ� �������� ���� �ٸ�
		myCar.startEngine();
		myCar.accelerate(50);
	}

}