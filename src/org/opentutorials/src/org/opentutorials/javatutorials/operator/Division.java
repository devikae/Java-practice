package org.opentutorials.javatutorials.operator;

public class Division {

	public static void main(String[] args) {
		// ������ �Ǽ��� Ÿ�Ժ��� �������� ����� ��� �ɱ�
		int a = 10;
		int b = 3;
		
		float c = 10.0f;
		float d = 3.0f;
		
		System.out.println(a/b); //10�� 3���� ������ 3.33333...�� ���;� ������ ���� Ÿ�� �������̱� ������ �Ҽ��� �ڸ� �ҽ� 
		System.out.println(c/d); //10.0f�� 3.0f�� ������ �Ǽ��� ���� ��ұ� ������ �Ҽ��� �ڸ��� ��� �ȴ�
		System.out.println(a/d); //10�� 3.0f�� ������ ��� �� ��ȯ�� �ɱ� 
		// �� ǥ�� ������ ���� ������ Ÿ������ �� ��ȯ�� �Ǽ� 10�� 10.0f�� �� ��ȯ ���� ���� �׷��Ƿ� c/d�� ���� �� ���

	}

}
