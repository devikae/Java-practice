package org.review_for_wrong_answer;
import java.util.Scanner;
public class ScannerIf {

	public static void main(String[] args) {
		// ���� �Է¹޾� -���� �۰ų� 100���� ũ�� "�Է¿���!!" ��� 
		//(if���� ||�����ڸ� �̿��Ͻÿ�)
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� �Է� ���ּ���>> ");
		
		int i = sc.nextInt();
		
		if(i<0 || i>100) {
			System.out.println("�Է� ����!!");
		}else {
			System.out.println("�Էµ� �� : " + i);
		}

		
		

			}
		

	
}

