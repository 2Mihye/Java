package com.kh.classBM;

import com.kh.classAM.AM;

public class BM extends AM {
	// public static void main(String[]  args) { // Java���α׷��� �������̶� 
		// A�����ڸ� classBM���� ����� �;�!
	public void main() { // ���� extends������ �̷��� �����
		publicMethod();
		protectedMethod(); // ���� ��Ű�� �ȿ��� ���𰡸� �ؾ����� ��� ����! main �޼��忡�� ���� ȣ���� �ϰų� ������ ���� ȣ���� �ؾ� ��
						   //���� �����ڸ� ������ �־ ���� ��Ű�� ������ ȣ���� ���������� extends�� ����ؼ� ȣ���� �Ѵ�.
		
		// defaultMethod(); ���� ��Ű�� �ȿ����� ����� �����ϹǷ� �ٸ� ��Ű���� ��� �Ұ���
	}

}
