package org.opentutorials.javatutorials.array;

public class GetGroupDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] classGroup = {"������", "������", "���̶�", "�̰���"}; // 
		System.out.println(classGroup[0]); // ������ ���
		System.out.println(classGroup[1]); // ������(�̷��� ������ ���� ��� �Ѵ�)
		System.out.println(classGroup[2]); // ���̶�
		System.out.println(classGroup[3]); // �̰��� 
		//                       [index]
		
		
		//�迭�� �����ϴ� �ٸ� ����� �迭�� ��� �ִ� ���� ���� �˾Ƴ��� ���
		//������ �Ϸ��� ���� �迭�ȿ� ��� �����Ͱ� ����ִ��� �˾Ƴ��°͵� ����� �߿�!
		
		String[] classGroup2 = new String[4];
//new�� �����ߴ� ���ο� ���ڿ������� Ÿ������ ����� [4���� �����Ͱ� ����ִ�] []�ȿ� �迭�� ���� ����
		classGroup2 [0] = "������";
		System.out.println(classGroup2.length); //.length�� �迭�� ���� �� �ִ� ������ ��
		classGroup2 [0] = "������";
		System.out.println(classGroup2.length);// ����ִ� �����Ͱ��� �˷��ִ°� �ƴ� ���� �� �ִ� ���� ���� �˷��ִ°�
		classGroup2 [0] = "���̶�";
		System.out.println(classGroup2.length); // �׷��� ������ ��°��� ��� 4
		classGroup2 [0] = "�̰���";
		System.out.println(classGroup2.length);

		
		  /*      length :4
		          ��|��|��|�� <
		          ��|��|��|�� <  } element (����)
		          ��|��|��|�� <
           index> 0|1,|2|3 
	    */
	} 
}
