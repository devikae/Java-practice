package org.opentutorials.javatutorials.array;

public class ArrayLoopDemo {

	public static void main(String[] args) {
		// �迭�� ��� 
		
		String[] members = { "������", "������", "���̶�" };
        for (int i = 0; i < members.length; i++) {
        	               //members.longth�� ��� �� ������ ���� [3]
            String member = members[i];
         //���ڿ��� ��� ����    //ó�� ���� �� i�� ���� 0  > ������ 
// member�� 1������ �������� ��� // �Ŀ� 1 ���� > ������ ���̶� ���
// �迭�� ����� �ݺ����� �ۼ��ϸ� �����͸� ������ ó���� �Ѵ�.           
            System.out.println(member + "�� ����� �޾ҽ��ϴ�");

	}

}
}
