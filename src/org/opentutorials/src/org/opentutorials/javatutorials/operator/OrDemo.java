package org.opentutorials.javatutorials.operator;

public class OrDemo {

	public static void main(String[] args) {
		// OR������  ���� || ���� �� �Ѱ��� ���̿��� ��� ���
		if (true || true) {
			System.out.println(1);  // �� �� true if�� ���� 
		}
		if (true || false) { 
			System.out.println(2);  // ���� �ϳ��� true�� if�� ���� 
		}
		if (false || true) {
			System.out.println(3);  
		}
		if (false || false)
			System.out.println(4); // �� �� false�̱� ������ ����X
	}


	
}
