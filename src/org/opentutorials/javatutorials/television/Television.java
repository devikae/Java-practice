package org.opentutorials.javatutorials.television;

public class Television {
	
	// �ڸ����� �̶�� Ŭ������ ����. 
	
	// Ŭ���� = ���赵 ���� �� ���赵�� �۾��Ϸ��� ��ü�� �����ؾ� �Ѵ�.
	
	// �ڷ������� 3���� �ʵ�� �̷������.
	// ���α׷��� ���忡�� ���� ���ο� Ŭ������ �����ϴ� ���� ���ο��ڷ���(type)�� �߰��ϴ� �Ͱ� ����.
	
	
	int channel;        // ä��
	int volume; 		// ���� 
	boolean onOff;		// ���� ����
	
	// �Ʒ�ó�� Ŭ���� ��ü�� ������ ����� �����ϸ� TelevisionTest�� ����� �� ���� ���ϴ�.
	public static void main(String[] args) {
		Television tv= new Television();
		tv.channel = 7;
		tv.volume = 10;
		tv.onOff = true;
		System.out.println("�ڷ����� ä���� " + tv.channel + "�� �̸�" +
				" ������ " + tv.volume + " �Դϴ�.");
	}
}
