package org.opentutorials.javatutorials.method;

public class MethodDemo2 {
	
	//�޼ҵ��� �Է°� ��� 
	
	//�������ΰͰ� �������ΰ��� �����ϸ� ���α׷���
	
	
	
	public static void numbering(int limit) {
		int i = 0;              //�Է��� ���� ���� "�Ű�����"
		while (i < limit) {
			System.out.println(i);
			i++;
			
		}
	}


	public static void main(String[] args) {
		numbering(4); //�ѹ��� �޼ҵ带 ȣ�� 
		// ȣ���� �� ()���� ���ڸ� limit�� ��� ���
		// () < �Է��� ���� ���� "�Ű�����" 
		// ()�ȿ� ���� �� "����"
	}
}
