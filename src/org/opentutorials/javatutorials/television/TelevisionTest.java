package org.opentutorials.javatutorials.television;

public class TelevisionTest {
	// Television Ŭ������ �׽�Ʈ �ϱ� ���� �������� ���� class 
	
	public static void main(String[] args) {
		Television tv = new Television(); // Television�� �ϳ��� ���ο� ������ Ÿ��  > tv�� ����
//			       ��ü�� new �����ڷ� �����ȴ�.
//Television Ŭ������ ��ü�� ������ �� �ִ� ���� tv �� �����Ѵ�.

		
		
// ��ü 1		
		tv.channel = 7;
		tv.volume = 10;
		tv.onOff = true;
		System.out.println("�ڷ����� ä���� " + tv.channel + "�� �̸�" +
							" ������ " + tv.volume + " �Դϴ�.");
		
		
		
		
// ��ü 2		
		Television yourtv = new Television();
		
		yourtv.channel = 10;
		yourtv.volume = 15;
		tv.onOff = true;
		
		
		System.out.println("���� �ڷ����� ä���� " + tv.channel + "�� �̸�" +
				" ������ " + tv.volume + " �Դϴ�."); 
		System.out.println("���� �ڷ����� ä���� " + yourtv.channel + "�� �̸�" +
				" ������ " + yourtv.volume + " �Դϴ�.");
		
	}

}
