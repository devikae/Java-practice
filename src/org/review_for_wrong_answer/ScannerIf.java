package org.review_for_wrong_answer;
import java.util.Scanner;
public class ScannerIf {

	public static void main(String[] args) {
		// 값을 입력받아 -보다 작거나 100보다 크면 "입력오류!!" 출력 
		//(if문과 ||연산자를 이용하시오)
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("값을 입력 해주세요>> ");
		
		int i = sc.nextInt();
		
		if(i<0 || i>100) {
			System.out.println("입력 오류!!");
		}else {
			System.out.println("입력된 값 : " + i);
		}

		
		

			}
		

	
}

