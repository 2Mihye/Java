package com.kh.hw.person.model.vo;

import java.util.Scanner;

public class Main {
	// �л��� ����� �� �ְ� ����
	// name = ȫ�浿, age=20, height=178.2, weight=70.0, grade=1, major = �����ý��۰��ϰ�
	/*
	 �л��� �̸�, ����, Ű , ������, �޿�, �μ�, ��� �Է��Ͻðڽ��ϱ�?(Y/N)
	 */
	/*
	public static void main(String[] args) {
		Student[] students = new Student[3];
		Employee employee[] = new Employee[10];
		Scanner sc = new Scanner(System.in);
		
		System.out.println("==�����Դϴ�.==");
		students[0] = new Student("������", 20, 170.0, 55, 1, "���������а�");
		
		for(Student student : students) {
			System.out.println(student.information());
		}
	
		// while �̿��ؼ� �ݺ����ǻ��
		char ch;
		String name, dept;
		int age, salary, count = 0;
		double height, weight;
		while(true) {
			System.out.println("1/6 �̸� : ");
			name = sc.nextLine();
			
			System.out.println("2/6 ���� : ");
			age = sc.nextInt();
			
			System.out.println("3/6 Ű : ");
			height = sc.nextDouble();
			
			System.out.println("4/6 ������ : ");
			weight = sc.nextDouble();
			
			System.out.println("5/6 �޿� : ");
			salary = sc.nextInt();
			
			System.out.println("6/6 �μ� : ");
			dept = sc.nextLine();
			employee[count] = new Employee(name, age, height, weight, salary, dept);
			count++;
			System.out.println("��� �Է��Ͻðڽ��ϱ�? (Y/N) : ");
			ch = sc.nextLine().toUpperCase().charAt(0);
			
			if(ch == 'N') {
				break;
			}
			
		}
		for (int i = 0; i < count; i++) {
			System.out.println(employee[i].information());
		}
	}
*/
}
