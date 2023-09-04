package com.kh.classSample;

public class CarMain {

	public static void main(String[] args) {
		//public Car(String brand, String model)
			   //public Car(String brand, String model);
		Car myCar = new Car("Toyota","Carmy"); // Scanner와 비슷하게 생겼지만 조금 다름
		myCar.startEngine();
		myCar.accelerate(50);
	}

}