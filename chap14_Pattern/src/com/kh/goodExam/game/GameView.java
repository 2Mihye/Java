package com.kh.goodExam.game;

public class GameView {
	// �ҷ��� �� ��� �������
	public void displayMessage() {
		// ������ ��Ʈ
		System.out.println("���� ���߱� ������ �����մϴ�.");
		System.out.println("1���� 100 ������ ���ڸ� ���纸����!");
	}
	
	// ���ڸ� �����ϴ� �� �Է��ϰ� ������� Ʋ�ȴ��� ���� �Ͱ� �õ�Ƚ��, ��������
	// 1. ���� �����ϴ� �� �Է��ϱ�
	public void displayGuessPrompt() {
		System.out.println("������ ���ڸ� �Է��ϼ���.");
	}
	
	public void displayCorrectGuess() {
		System.out.println("���ڸ� ������ϴ�.");
	}
	
	public void displayIncorrectGuess() {
		System.out.println("Ʋ�Ƚ��ϴ�. �ٽ� �õ��ϼ���.");
	}
	
	public void displayAttempts(int attempts) {
		System.out.println("�õ�Ƚ�� : " + attempts);
	}
	
	public void displayGameOver() {
		System.out.println("���� ����!");
	}
}
