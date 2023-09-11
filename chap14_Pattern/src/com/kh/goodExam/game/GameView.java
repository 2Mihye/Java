package com.kh.goodExam.game;

public class GameView {
	// 불러온 값 어떻게 출력할지
	public void displayMessage() {
		// 오프닝 멘트
		System.out.println("숫자 맞추기 게임을 시작합니다.");
		System.out.println("1에서 100 사이의 숫자를 맞춰보세요!");
	}
	
	// 숫자를 추측하는 값 입력하고 맞췄는지 틀렸는지 적는 것과 시도횟수, 게임종료
	// 1. 숫자 추측하는 값 입력하기
	public void displayGuessPrompt() {
		System.out.println("추측한 숫자를 입력하세요.");
	}
	
	public void displayCorrectGuess() {
		System.out.println("숫자를 맞췄습니다.");
	}
	
	public void displayIncorrectGuess() {
		System.out.println("틀렸습니다. 다시 시도하세요.");
	}
	
	public void displayAttempts(int attempts) {
		System.out.println("시도횟수 : " + attempts);
	}
	
	public void displayGameOver() {
		System.out.println("게임 종료!");
	}
}
