package submit;

import java.util.Scanner;

public class Submit04 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
 
		System.out.print("현재 신장(cm)을  입력 해주세요 : ");
		double cm = sc.nextDouble();
		
		System.out.print("현재 체중(kg)을 입력 해주세요 :  ");
		double kg = sc.nextDouble();
		
		double standard = (cm - 100) * 0.9;
		double pig = ( kg / standard ) * 100;
		
		if(pig < 80) {
			System.out.println("저체중 입니다.");
		}else if(pig <110) {
			System.out.println("정상체중 입니다.");
		}else if (pig <130) {
			System.out.println("과체중 입니다.");
		}else if (pig > 130) {
			System.out.println("비만 입니다.");
		}else {
			System.out.println("초고도 멸치 / 돼지 ");
		}

		
	}

}
