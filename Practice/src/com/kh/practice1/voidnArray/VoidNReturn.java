package com.kh.practice1.voidnArray;

import java.util.Scanner;

/*
 * System.out.println();
 * void Ȱ��
 * return Ȱ��
 * static
 * */
public class VoidNReturn {
	public static void main(String[] args) {
		VoidNReturn vnr = new VoidNReturn();
		vnr.practice1();
		vnr.practice3();
	}
	
	public void practice1() {
		//�� ���� �� ���
		 Scanner scanner = new Scanner(System.in);
	       System.out.println("���� �ϳ��� �Է��ϼ���.");
	        int num1 = scanner.nextInt();
	       System.out.println("�ٸ� ���ڸ� �Է��ϼ���.");
	        int num2 = scanner.nextInt();

	        int sum = num1 + num2;
	       System.out.println("�� ���� ���� : " + sum);
	        
	    }
	
	/*
	public int practice2() {
		Scanner scanner = new Scanner(System.in);
        System.out.println("���� �ϳ��� �Է��ϼ���.");
        int n = scanner.nextInt();

        int factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        return n = factorial;
       
	    
	}
	*/
	
	public void practice3() {
		 Scanner scanner = new Scanner(System.in);
	     System.out.println("���ڿ��� �Է��ϼ���.");
	     String input = scanner.nextLine();

	     String reversed = new StringBuilder(input).reverse().toString();
	     System.out.println(reversed);
	       
	}
	
	/*
	public void practice4() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("���ڸ� �Է��ϼ���.");
        int size = scanner.nextInt();
        
        int[] numbers = new int[size];
        int sum = 0;

       
        for (int i = 0; i < size; i++) {
            numbers[i] = scanner.nextInt();
            sum += numbers[i];
        }
        
        
	}
	
	
	public practice5() {
		Scanner scanner = new Scanner(System.in);
	       
        int size = scanner.nextInt();
        
        int[] numbers = new int[size];

       
        for (int i = 0; i < size; i++) {
            numbers[i] = scanner.nextInt();
        }

        int max = numbers[0];
        for (int i = 1; i < size; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
	        
	        
	}
	public practice6() {
		Scanner scanner = new Scanner(System.in);
        
        int num = scanner.nextInt();
        
        boolean isPrime = isPrimeNumber(num);
        
        if (isPrime) {
          
        } else {
           
        }
    }
    
    public  boolean isPrimeNumber(int num) {
        if (num <= 1) {
            
        }
        
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
               
            }
        }
        
        
	}
    
    public calculate() { // practice7
    	/*���� ����� (���� ��� ��ȯ):

    	�޼��� �̸�: calculate

    	�Ű�����: �� ���� �Ǽ�(double Ÿ��) num1�� num2, �׸��� ������(String Ÿ��) operator
    	���: num1�� num2�� operator�� ���� ���ϱ�, ����, ���ϱ�, ������ ������ �����ϰ� ����� ��ȯ��.
    
    

    }
    public countWords() { // practice8
    	/*
    	�ܾ� ���� ����:

    	�޼��� �̸�: countWords

    	�Ű�����: ���ڿ�(String Ÿ��) text
    	���: �Էµ� ���ڿ����� ������ �������� �ܾ��� ������ ���� ����� �����(void ���� Ÿ��).
    	
    

    }
    public printTriangle() { //practice9
    	/*
    	�ﰢ�� �� ���:

    	�޼��� �̸�: printTriangle

    	�Ű�����: ���� ����(int Ÿ��) height
    	���: ���̰� height�� �ﰢ�� ����� ���� �����(void ���� Ÿ��).
    	
    

    }
    public generateLottoNumbers() { //practice10
    	/*
    	�ζ� ��ȣ ������:
    	Random
    	�޼��� �̸�: generateLottoNumbers

    	�Ű�����: �ζ� ��ȣ�� ����(int Ÿ��) count
    	���: �ߺ����� �ʴ� ������ �ζ� ��ȣ�� count��ŭ �����Ͽ� �����(void ���� Ÿ��).
    

    }
    */
    
}
