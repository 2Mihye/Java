package com.kh.goodExam.game;

public class GameView {
	private String opening = "���� ���߱� ������ �����մϴ�.";
	private String msg = "1���� 100 ������ ���ڸ� ���纸����!";
	private String inputNum = "������ ���ڸ� �Է��ϼ���.";
	private String correctNum = "���ڸ� ������ϴ�.";
	private String wrongNum = "Ʋ�Ƚ��ϴ�. �ٽ� �õ��ϼ���.";
	private String attmps = "�õ�Ƚ�� : ";
	private String gameOver = "���� ����!";
	
	// �ҷ��� �� ��� �������
	public void displayMessage() {
		// ������ ��Ʈ
		System.out.println(opening);
		System.out.println(msg);
	}
	
	// ���ڸ� �����ϴ� �� �Է��ϰ� ������� Ʋ�ȴ��� ���� �Ͱ� �õ�Ƚ��, ��������
	// 1. ���� �����ϴ� �� �Է��ϱ�
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
