package submit;

import java.util.Scanner;

public class Submit04 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
 
		System.out.print("���� ����(cm)��  �Է� ���ּ��� : ");
		double cm = sc.nextDouble();
		
		System.out.print("���� ü��(kg)�� �Է� ���ּ��� :  ");
		double kg = sc.nextDouble();
		
		double standard = Math.abs(cm - 100) * 0.9;
		double pig = ( kg / standard ) * 100;
		
		if(pig < 80) {
			System.out.println("��ü�� �Դϴ�.");
		}else if(pig <110) {
			System.out.println("����ü�� �Դϴ�.");
		}else if (pig <130) {
			System.out.println("��ü�� �Դϴ�.");
		}else if (pig > 130) {
			System.out.println("�� �Դϴ�.");
		}else {
			System.out.println("�ʰ� ��ġ / ���� ");
		}

		
	}

}