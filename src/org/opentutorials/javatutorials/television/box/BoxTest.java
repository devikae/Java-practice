package org.opentutorials.javatutorials.television.box;

public class BoxTest {
	public static void main(String[] args) {
		
		//QUESITION 
		// �ڽ���� Ŭ������ �����ϰ� ������ ���� ���� ���̴� 20 20 30�Դϴ� ����ϱ� 
		
		
		Box box = new Box();
		
		box.width = 20;
		box.length = 20;
		box.height = 30;
		
		System.out.println("�ڽ��� ����, ����, ���̴� " + box.width + ", " + box.length + ", "
							+ box.height+"�Դϴ�.");
		
	}
}
