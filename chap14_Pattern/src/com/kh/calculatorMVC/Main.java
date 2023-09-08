package com.kh.calculatorMVC;

public class Main {

	public static void main(String[] args) {
		// model view controller
				
		// model = CalculatorModel 가져오기
		CalculatorModel model = new CalculatorModel();
		
		// view = CalculatorView 가져오기
		CalculatorView view = new CalculatorView();
		
		// Controller = CalculatorController 가져오기
		CalculatorController controller = new CalculatorController(model, view);
		
		controller.run();
	}

}
