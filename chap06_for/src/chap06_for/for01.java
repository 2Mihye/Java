package chap06_for;

public class for01 {

	public static void main(String[] args) {
		/*
		 for���̶�? ���α׷��ֿ��� �ݺ� �۾��� �����ϱ� ���� ���Ǵ� ������̰�, Ư���� ������ �����ϴ� ���� �ڵ����� �ݺ� �����ϴµ� ����
		 
		 
		 ��κ��� ���α׷��� ���� for���� ���� ����
		 
		 for (�ʱ�ȭ; ����; ����) {
		 	������ ���� ��� �ݺ������� ������ �ڵ�
		 }
		 
		 �ʱ�ȭ : �ݺ����� ���۵� ��(���� 1ȸ) �� ���� ����Ǵ� �κ�����, �ݺ� ������ �ʱ�ȭ�ϴ� ������ �Ѵ�.
		 ���ǽ� : �ݺ����� ����� ������ �˻��ϴ� �κ����� ������ ���� ��쿡�� �ݺ��ڵ� ��� ���� �� ����
		 ������ : �ݺ� ������ ������Ű�ų� ���ҽ�Ű�� �κ�����, �ݺ� �ڵ��� ���� �� ����
		 
		for (int i = 1; i <= 5; i++) {
			// ���� <= 5 �� ���� ��쿡 ����Ǵ� ����
			System.out.println(i);
		}
		
		for (int i = 0; i <= 5; i++) {
			System.out.println("i�� �� : " + i);
		}
		
		for (int i = 2; i <=7; i++) {
			System.out.println("i�� �� : " + i);
		}
		
		for (int i = 10; i >= 5; i--) {
			System.out.println("i�� -�� : " + i);
		}
		
		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			// ��
			sum += i;
			System.out.println("1���� 10������ �� : " + sum);
		}
		// sum�� ���� 1~5������ ������ ����ϱ�
		sum = 0;
		for(int i = 1; i <= 5; i++) {
			sum+=i;
			System.out.println("1���� 5������ �� : " + sum);
		}
		
		
		int sum1 = 10;
		for(int i = 5; i >= 2; i--) {
			sum1-= i;
			System.out.println("sum - : " + sum1);
		}
		*/
		int mul = 1;
		for (int i = 1; i <= 9; i++) {
			mul = 2 * i;
			System.out.println("mul : " + mul);
		}
	}

}
