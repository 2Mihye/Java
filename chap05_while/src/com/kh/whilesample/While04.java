package com.kh.whilesample;

public class While04 {

	public static void main(String[] args) {
		// 1���� 10���� �� ���ϱ�
		int sum = 0; // ���� ��
		int num = 1;
		
		while(num <= 5) { // true
			System.out.println("num = " + num);
			sum += num;
			num = ++num;
			//System.out.println("sum = " + sum); // sum�� �հ踦 �ֱ������� ����ʹٸ� while�� �ȿ� �ۼ��ϱ�
		}
		System.out.println("sum = " + sum);
		/*
		 while���� ����Ǿ����ؼ� Ŭ������ ����� ���� �ƴ�.
		 while���� �߷�� �� �����ִ� System.out.println(sum)�� ��µ�.
		 */
	}

}
