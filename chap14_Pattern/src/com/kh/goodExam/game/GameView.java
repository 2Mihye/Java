package com.kh.goodExam.game;

public class GameView {
	private String opening = "숫자 맞추기 게임을 시작합니다.";
	private String msg = "1에서 100 사이의 숫자를 맞춰보세요!";
	private String inputNum = "추측한 숫자를 입력하세요.";
	private String correctNum = "숫자를 맞췄습니다.";
	private String wrongNum = "틀렸습니다. 다시 시도하세요.";
	private String attmps = "시도횟수 : ";
	private String gameOver = "게임 종료!";
	
	// 불러온 값 어떻게 출력할지
	public void displayMessage() {
		// 오프닝 멘트
		System.out.println(opening);
		System.out.println(msg);
	}
	
	// 숫자를 추측하는 값 입력하고 맞췄는지 틀렸는지 적는 것과 시도횟수, 게임종료
	// 1. 숫자 추측하는 값 입력하기
	public void displayGuessPrompt() {
		System.out.println(inputNum);
	}
	
	public void displayCorrectGuess() {
		System.out.println(correctNum);
	}
	
	public void displayIncorrectGuess() {
		System.out.println(wrongNum);
	}
	
	public void displayAttempts(int attempts) {
		System.out.println(attmps + attempts);
	}
	
	public void displayGameOver() {
		System.out.println(gameOver);
	}
}
