package org.review_for_wrong_answer;

import java.util.Scanner;

public class Quesition9 {

	public static void main(String[] args) {
		
		//�Էµ� ���ڰ� �빮���̸� �ҹ��ڷ� ����ϰ� �ҹ����̸� �빮�ڷ� ��ȯ�Ͽ� ���
		// �� �� ���� �Է½� �Է� ������ ���� ǥ�� if else�� ��� 
		
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Input Character :");

		String i = sc.nextLine();
		
		
		Character.isUpperCase(i.charAt(0));
		
		if(Character.isUpperCase(i.charAt(0))) {     // �빮�� �Է½�
			i = i.toLowerCase();
			System.out.println("result : " + i);
		}else if(Character.isLowerCase(i.charAt(0))) { //�ҹ��� �Է½� 
			i = i.toUpperCase();
			System.out.println("result : " + i);
		}else {
			System.out.println("�Է� ������ ����");
		}

	}

}
