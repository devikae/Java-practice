package org.opentutorials.javatutorials.type_conversion;

public class ExplicitConversion {

	public static void main(String[] args) {
		// �ڵ� �� ��ȯ�� ������� �ʴ� ��� �������� �� ��ȯ�� �ؾ��Ѵ� �̸� ����� �� ��ȯ �̶�� �Ѵ�.
		
	//float a = 100.0; double���� float�� �����Ϳ� ������ �ϱ� ������ �ڵ� �� ��ȯ�� �Ͼ�� �ʾ� ���� �߻�
	//int b = 100.0f;  ���� ���� ��� �ڵ� �� ��ȯ�� �Ͼ ��� ������ �ս��� �Ͼ�� ������ ���� �߻� 
		
		float a = (float)100.0;  //��ȣ�� float�� �־� ����� �� ��ȯ�� ��Ų��
		int b = (int)100.0f;     //���� ������ 100.1f��� ���� �� �� ó�� �� ��ȯ �ϸ� 0.1�� �ҽǵȴ�.
		
		
  		

	}

}
