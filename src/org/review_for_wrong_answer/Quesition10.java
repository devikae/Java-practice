package org.review_for_wrong_answer;
import java.util.Scanner;
public class Quesition10 {

	public static void main(String[] args) {
		// [����10] 4���� ���� �ֿܼ��� �Է¹޾� ó���Ͻÿ�
        // ����) ���� : M �̸� "����", ������ "����"  (���� ������ �̿�)

		Scanner sc = new Scanner(System.in);

		System.out.print("Input name: ");

		String name = sc.nextLine();
		
		System.out.print("input gender(M/F): ");
		
		String gender =  sc.nextLine();
		String gender2 = (gender.equals("M")) ? "����" : "����";
		
		System.out.print("input age: ");
		
		int age =  sc.nextInt();
		
		System.out.print("input tall(cm): ");
		
		float tall = sc.nextFloat();
		
		System.out.println("--���--");
		System.out.println("�̸� : "+ name );
		System.out.println("���� : "+ gender2 );
		System.out.println("���� : "+ age );
		System.out.println("���� : "+ tall );
		
		

	}

}
