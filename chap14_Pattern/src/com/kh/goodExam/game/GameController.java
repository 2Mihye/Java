package com.kh.goodExam.game;

import java.util.Scanner;

public class GameController {
	// �𵨰� �� �������ֱ�
	// 		String
	private GameModel model;
	private GameView view;
	
	public GameController(GameModel model, GameView view) {
		this.model = model;
		this.view = view;
	}
	
	public void runGame() {
		// ���� �޼��� �����ִ� �� ����ϰ� ��ĳ�� �Է��ؼ� �Է°� ȣ��
		view.displayMessage();
		Scanner sc = new Scanner(System.in);
		
		
		// boolean isTrue = true;
		// ��ǻ�Ͱ� ������ ���ڸ� ������ �� �ҷ��� view
		while(true) {
			// ���� �����ϴ� ���� �Է�����
			view.displayGuessPrompt();
			int guess = sc.nextInt();
			// ���� ��ǻ�Ͱ� ������ ���ڿ� ���� �Է��� ���ڰ� �ٸ� �� �ҷ��� view
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
