package submit;

import java.util.Scanner;

public class Submit05 {

	public static void main(String[] args) {
		
		
		int ans = 0;
		int hint = 5;
		int des = (int) (Math.random() * 50) + 1; // 1~100 ���� ���� ��
		Scanner input = new Scanner(System.in);
		
		for(int i = 0; i <5; i++) {
			
			System.out.print("���ڸ� �Է� ���ּ���: ");
			ans = input.nextInt();
			hint--;
			
			if (hint == 0) {
				System.out.println("�����Ͽ����ϴ�. ������ " + des +"�Դϴ�.");
				break;}
			if (ans < des) {
				System.out.println("�ٿ�!! ��ȸ�� " + hint + "�� ���ҽ��ϴ�.  ");
			}else if (ans > des) {
				System.out.println("��!!  ��ȸ�� " + hint + "�� ���ҽ��ϴ�.  ");
			}else if(ans == des) {
				System.out.println("�����Դϴ�.");
			}else {
				System.out.println("�����Դϴ�.");
				break;}
			
			
			}
		}
		
		
	}