package org.opentutorials.javatutorials.operator;

import org.opentutorials.javatutorials.variable.string;

public class Arithmetic {

	public static void main(String[] args) {
		// ����, ���, ��, �� ������ ���� �ִ�.  ��� ������(+ - * / %) 
		
		int result = 1 + 2;
		System.out.println(result);  // ���� 3 
		
		result = result - 1;
		System.out.println(result); // �� 2 
		
		result = result * 2;
		System.out.println(result);  // �� 4
		
		result = result / 2;
		System.out.println(result); // �� 2
		
		result = result + 8;
		System.out.println(result); // �� 10
		
		result = result % 7;
		System.out.println(result); // �� 3 
		
		// ������ ������ 
		
		int a = 3;
		
		System.out.println(0%a); // 0�� 3���� ������ > 0
		System.out.println(1%a); // 1�� 3���� ���� ������ > 1
		System.out.println(2%a); // 2�� 3���� ���� ������ > 2
		System.out.println(3%a); // 3�� 3���� ���� ������ > 0
		System.out.println(4%a); // 4�� 3���� ���� ������ > 1
		System.out.println(5%a); // 5�� 3���� ���� ������ > 2
		System.out.println(6%a); // 6�� 3���� ���� ������ > 0
        
		//�̷��� ���� ������ ���� ȭ�鿡 ��� 
		// �������� �� ���� ��ȯ�ϴ� ���� ���� �� �ִ�.
		
		
		// ���ϱ� ������ 
		
		String firstString = "This is";
		String secondString = " a concatenated string.";
		String thirdString = firstString + secondString;
		System.out.println(thirdString);                   // ���ڿ� ���ڸ� ���� �� �� ���ϱ� �����ڸ� ����ϸ� �ȴ�.
		
		
	}

}
