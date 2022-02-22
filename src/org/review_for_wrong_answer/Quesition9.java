package org.review_for_wrong_answer;

import java.util.Scanner;

public class Quesition9 {

	public static void main(String[] args) {
		
		//입력된 문자가 대문자이면 소문자로 출력하고 소문자이면 대문자로 변환하여 출력
		// 그 외 문자 입력시 입력 데이터 오류 표시 if else문 사용 
		
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Input Character :");

		String i = sc.nextLine();
		
		
		Character.isUpperCase(i.charAt(0));
		
		if(Character.isUpperCase(i.charAt(0))) {     // 대문자 입력시
			i = i.toLowerCase();
			System.out.println("result : " + i);
		}else if(Character.isLowerCase(i.charAt(0))) { //소문자 입력시 
			i = i.toUpperCase();
			System.out.println("result : " + i);
		}else {
			System.out.println("입력 데이터 오류");
		}

	}

}
