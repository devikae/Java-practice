package org.opentutorials.javatutorials.operator;

public class PrePost {

	public static void main(String[] args) {
		// ���׿����� >> +3 (���) -3 (����) ++(���� 1����) --(���� 1����)
		
		int i = 3;  // i�� ���� 3
		i++;       // i + 1
		
		System.out.println(i);  //����� i(3) + 1 = 4
		++i;
		System.out.println(i);  //i (4) + 1 = 5
		System.out.println(++i); //i ��� ������ 1�̶�� ���� ���� ����� ��ȣ �ȿ� ġȯ�� ���
		System.out.println(i++); // i�� ���� 1�� ��������� ������ ��ȣ �ȿ����� �������� �ʰ� ���� ����� ���
		System.out.println(i); // ������ ���� �� ��µǱ� ������ 7
		
	}

}
