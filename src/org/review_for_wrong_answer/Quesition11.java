package org.review_for_wrong_answer;
import java.util.Scanner;

public class Quesition11 {

	public static void main(String[] args) {
		//2���� ���ڿ� �����ڸ� �Է��Ͽ� ����Ͻÿ�
       // ����1) �Ǽ��ΰ��� �Ҽ����� 2°�ڸ����� ����Ͻÿ�
       // ����2) �����ڰ� +,-,*,/ �̿��� ���ڰ� ������ 
         //      "������error"����Ͻÿ�

		Scanner sc = new Scanner(System.in);
		
		
		Scanner sc1 = new Scanner(System.in);
	
		
		
		System.out.print("A�� ���� �Է��Ͻÿ� : ");
		int a = sc.nextInt();
		System.out.print("B�� ���� �Է��Ͻÿ� : ");
		int b = sc.nextInt();
		
		System.out.print("������ �Է�(+,-,*,/)");
		String OR = sc1.nextLine();
	
		
		if(OR.equals("+")) {
			int plus = a + b;
			System.out.println(a + OR + b + " = " + plus );
		}else if(OR.equals("-")) {
			int minus = a - b;
			System.out.println(a + OR + b + " = " + minus );
		}else if(OR.equals("*")) {
			int x = a * b;
			System.out.println(a + OR + b + " = " + x );
		}else if(OR.equals("/")) {
			double division = a / b;
			
			System.out.println(a + OR + b + " = " + (Math.ceil(division * 100)/100.0));
		}else {
			System.out.println("������ error");
		}
		
		
		
		
		

	}

}
