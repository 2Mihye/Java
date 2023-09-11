package com.kh.goodExam.game;

import java.util.Scanner;

public class GameController {
	// 모델과 뷰 연결해주기
	// 		String
	private GameModel model;
	private GameView view;
	
	public GameController(GameModel model, GameView view) {
		this.model = model;
		this.view = view;
	}
	
	public void runGame() {
		// 최초 메세지 보여주는 거 출력하고 스캐너 입력해서 입력값 호출
		view.displayMessage();
		Scanner sc = new Scanner(System.in);
		
		
		// boolean isTrue = true;
		// 컴퓨터가 생각한 숫자를 맞췄을 때 불러올 view
		while(true) {
			// 숫자 추측하는 값을 입력하자
			view.displayGuessPrompt();
			int guess = sc.nextInt();
			// 만약 컴퓨터가 생각한 숫자와 내가 입력한 숫자가 다를 때 불러올 view
			if (model.isCorrectGuess(guess)) {
				view.displayCorrectGuess();
				view.displayAttempts(model.getAttempts());
				break;
				//isTrue = false;
			} else {
				view.displayIncorrectGuess();
				view.displayAttempts(model.getAttempts());
			}
		}
		view.displayGameOver();
	}
	
	public static void main(String[] args) {
		GameModel m = new GameModel();
		GameView v = new GameView();
		GameController c = new GameController(m,v);
		
		c.runGame();
	}
	
	
}
