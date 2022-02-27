package org.review_for_wrong_answer;
import java.util.Scanner;

public class Quesition09 {

	public static void main(String[] args) {
		// 입력된 문자가 대문자이면 소문자로 출력 소문자면 대문자로 출력 
		// 그 외 문자이면 입력 데이터 오류 출력 
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Input Character: ");
		
		String a =  sc.nextLine();
		
		char ch = a.charAt(0);
		
		if(Character.isUpperCase(ch) == true) {
			
			String ch1 = a.toLowerCase();
			
			char ch2 = ch1.charAt(0);
			
			System.out.println("result : " + ch2 );
			
		}else if(Character.isLowerCase(ch) == true) {
			
			String ch3 = a.toUpperCase();

			char ch4 = ch3.charAt(0);

			System.out.println("result : " + ch4);

		} else {
			System.out.println("입력 데이터 오류");
		}

	}

}
