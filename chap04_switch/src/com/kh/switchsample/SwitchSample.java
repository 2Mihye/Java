package com.kh.switchsample;

public class SwitchSample {

	public static void main(String[] args) {
		// Switch�� : Ư�� ������ ǥ������ ���� ���� �پ��� ��츦 ó���ϴ� ���� ����
		//			 Switch���� �Ϸ��� case���� �ش� ���� ���Ͽ� ��ġ�ϴ� ��쿡 �ش� �ڵ����� �����ϰ� �� case�� �ڿ��� ��ġ�ϴ� 
		//			 ���̳� ǥ������ ����.
		/*
		 switch (���� �Ǵ� ǥ����) {
		 	case ��1 :
		 		// ��1�� �ش��ϴ� �ڵ�
		 		break; // �ش� ����� ���̶� ������ �ǰ��� ���������� ����
		 	case ��2 :
		 		// ��2�� �ش��ϴ� �ڵ�
		 		break;
		 	case ��3 :
		 		// ��3�� �ش��ϴ� �ڵ�
		 		break;
		 	default : 
		 		// �� ��� ���̽��� ��ġ���� ���� �� ����Ǵ� �ڵ�
		 }
		 */
		
		int date = 30;
		switch (date) {
			case 1: // case�� 30�̸� ������ ����ε� �ƴϱ� ������ false
				System.out.println("������");
				break;
			case 2: // false
				System.out.println("ȭ����");
				break;
			case 30: // true
				System.out.println("������");
				break;
			default:
				System.out.println("�ָ�");
		}
		
		int choice = 4;
		switch (choice) {
			case 1:
				System.out.println("�Ƹ޸�ī�� �ֹ��ϼ̽��ϴ�.");
				break;
			case 2:
				System.out.println("ī�� �� �ֹ��ϼ̽��ϴ�.");
				break;
			case 3:
				System.out.println("���ν���� �ֹ��ϼ̽��ϴ�.");
				break;
			case 4:
				System.out.println("�ٴҶ�� �ֹ��ϼ̽��ϴ�.");
				break;
			default:
				System.out.println("�߸��� �����Դϴ�. �ٽ� �ֹ����ּ���.");
				
		}
		
		
	}

}
