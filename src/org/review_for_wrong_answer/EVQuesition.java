package org.review_for_wrong_answer;

import java.util.Scanner;

public class EVQuesition {

	public static void main(String[] args) {
		// ���������Ͱ� 2 �� �ִ� �������� ���������� ��ư�� ������ �� �� ���� ���������Ͱ� �̵��ϴ� ���α׷� ���� 
		// 1,������� ���� ��ġ�� ��ĳ�ʷ� �Է��ϸ� ������� ��ġ�� �� ����� ���������Ͱ� �̵��Ѵ�.     >> �� ����� ������� ��ġ 
		// 2.������� ��ġ�� �� ������������ ��ġ�� ���� �ϴٸ� (���� 5�� ����1 3�� ����2 7�� �̸� ���� ������ �Ѵ�.) �����ϸ� ����������
		// 3.����ڰ� �Է��� ��ġ�� ������������ ��ġ�� �ٲ��ش� 
		// 4.���������� ���α׷��� ���� �Ϸ��� q, Q exit,Exit Exit�� �Է� 
		
		
		
		//for��, scanner, .equals() , LOWER,UPPER 
		

		
		
		
		int elvA = 10; // ����A�� ��ġ 10��
		int elvB = 4;  // ����B�� ��ġ 4��
		Scanner sc = new Scanner(System.in);
		
		
// ���������� ���� ��� �ٲܱ�
//���������͸� A �� �����̸� ����A�� Y������ �ʱ�ȭ 
		
		for(int i = 0; i<10; i++) {	
		
			System.out.println("================�ּ� �θ��� �Ҹ���=================");
			System.out.println("���� A�� ���� ��ġ" + elvA + " ��");
			System.out.println("���� B�� ���� ��ġ" + elvB + " ��");
			System.out.print("������ ��ó���? [�����Ͻ÷��� \"Q\" �Ǵ� \"EXIT\"�Է�]: ");
			
			String x = sc.nextLine();
				if( x.equals("q") || x.equals("Q") || x.equals("Quit") || x.equals("EXIT") || x.equals("Exit") || x.equals("eXIt")) {
					System.out.println("���α׷��� ����Ǿ����ϴ�.");
				}else if (isNumber(x)) { //����
					int Y = Integer.parseInt(x);
					System.out.println(Y + "������ ���������͸� ȣ�� �մϴ�.");
					if (Math.abs(elvA-Y) > Math.abs(elvB-Y)) {
						System.out.println("�°��� B�� " + Y + "������ �̵��Ͽ����ϴ�.");
						elvB = Y;
						}else if(Math.abs(elvA-Y) < Math.abs(elvB-Y)) {
							System.out.println("�°��� A�� " + Y + " ������ �̵��Ͽ����ϴ�");
							elvA = Y;
							}else if(Math.abs(elvA-Y) == Math.abs(elvB-Y)) {
								if (elvA > elvB){
									System.out.println("�°��� A��" + Y + "������ �̵��Ͽ����ϴ�.");
									elvA = Y;
									}else if (elvA < elvB){
										System.out.println("�°��� B��" + Y + "������ �̵��Ͽ����ϴ�.");
										elvB = Y;
										}
								}
				}else { 
					System.out.println("�߸� �Է� �Ǿ����ϴ�.");
				}

			   	
		
		/* ������ġ - A �� ������ġ -B ���� ũ�ٸ� ��B�� �;��Ѵ�
	     ��A > ��B   �� ����B 
	     ��B > ��A   �� ����A */ //��
			 

					
						
} // main 
		//
	}
	static boolean isNumber(String str) {
		boolean result = true;
		// null, �����Ͻ�
		if (str == null || str.length() == 0) {
			result = false;
		}
		// null�̳� ������ �ƴҽ�
		else {
			for (int i = 0; i < str.length(); i++) {
				int c = (int) str.charAt(i);
				// ���ڰ� �ƴ϶��
				if (c < 48 || c > 57) {
					result = false;
				}
			}
		}
		return result;
	}
	
	
	
}