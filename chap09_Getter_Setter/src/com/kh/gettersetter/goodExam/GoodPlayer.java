package com.kh.gettersetter.goodExam;

public class GoodPlayer {
	private String name; // ĳ���� �̸�
	private int health; // ĳ���� ü��
	private int attackPower; // ĳ���� ���ݷ�

	public void setName(String name) { // �̸��� ����Ǹ� ����� set
		this.name = name;
	}
	
	//�����ϴ� valid
	public void ValidName() { // ĳ�����̸��� ������ ������ ����!
		if(this.name == "") {
			this.name = "No name";
		}
	}
	
	public String getName() { // ĳ�����̸��� ��ȯ
		return name;
	}
	
	
	
	public void setHealth(int health) { // �Ű������� ����� ü�� �����ϴ� ��
		this.health = health;
	}
	
	public void ValidHealth() {
		// ���࿡ ü���� 0�̶�� 0���� ǥ��
		if(this.health <= 0) { // ü���� 0 ������ ���
		this.health = 0;
		}
	}
	
	public int getHealth() {
		return health;
	}

	
	
	
	public void setAttackPower(int attackPower) {
		this.attackPower = attackPower;
	}
	
	public void ValidAttackPower() { // ���Ἲ�ǰ� ������
		// ���࿡ �Ŀ��� 0���� ���� ���
		if(this.attackPower <= 0) {
			this.attackPower = 0;
		}
	}
	
	public int getAttackPower() {
		return attackPower;
	}

	// ��� �޼��� �ۼ�
	public void displayInfo() {
		System.out.println("ĳ���� ���� : " + this.name);
		System.out.println("ü�� ���� : " + this.health);
		System.out.println("���ݷ� ���� : " + this.attackPower);
	}

}
