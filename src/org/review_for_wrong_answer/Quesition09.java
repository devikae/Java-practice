package org.review_for_wrong_answer;
import java.util.Scanner;

public class Quesition09 {

	public static void main(String[] args) {
		// �Էµ� ���ڰ� �빮���̸� �ҹ��ڷ� ��� �ҹ��ڸ� �빮�ڷ� ��� 
		// �� �� �����̸� �Է� ������ ���� ��� 
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Input Character: ");
		
		String a =  sc.nextLine();
		
		char ch = a.charAt(0);
		
		if(Character.isUpperCase(ch) == true) {
			
			String ch1 = a.toLowerCase();
			
			char ch2 = ch1.charAt(0);
			
			System.out.println("result : " + ch2 );
			
		}else if(Character.isLowerCase(ch) == true) {
			
			String ch3 = a.toUpperCase();

			char ch4 = ch3.charAt(0);

			System.out.println("result : " + ch4);

		} else {
			System.out.println("�Է� ������ ����");
		}

	}

}
