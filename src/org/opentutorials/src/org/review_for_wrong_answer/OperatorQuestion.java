package org.review_for_wrong_answer;

public class OperatorQuestion {

	public static void main(String[] args) {
		// ���� ���� �ð��� �� ���� ����
		//���� �����ڸ� �̿��ؼ� �Ʒ��� �ֹι�ȣ ���ڸ��� ù��° ���ڿ� ���� ������ 
		//�ֹι�ȣ ���ڸ� ���ڰ� Ȧ���� ����, ¦���� ���� 
		
		String hisIdBack = "3231476";
		String herIdBack = "4243654";
		
		int hisFirst = Integer.parseInt(hisIdBack.substring(0, 1)); //��Ƽ���� ����� ���ڿ��� ������ ��ȯ 
		int herFirst = Integer.parseInt(herIdBack.substring(0, 1)); // ����Ʈ���� ����� �� ���ڸ����� ����
		
	    System.out.println(hisFirst % 2); 
	    System.out.println(herFirst % 2);
	    
	    String hisgender = (hisFirst % 2 == 1) ? "����" : "����"; //������ ���� 2�� ���� ������ ���� 1�̸� ���� ���
	    String hergender = (herFirst % 2 == 1) ? "����" : "����"; //������ ���� 1�� �ƴϸ� ¦�� ���� ��� 
	    System.out.println(hisgender);
	    System.out.println(hergender);
	    


	}

}
