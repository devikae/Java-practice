package org.review_for_wrong_answer;
import java.util.Scanner;
public class Quesition10 {

	public static void main(String[] args) {
		// [문제10] 4개의 값을 콘솔에서 입력받아 처리하시오
        // 조건) 성별 : M 이면 "남자", 나머지 "여자"  (삼항 연산자 이용)

		Scanner sc = new Scanner(System.in);

		System.out.print("Input name: ");

		String name = sc.nextLine();
		
		System.out.print("input gender(M/F): ");
		
		String gender =  sc.nextLine();
		String gender2 = (gender.equals("M")) ? "남자" : "여자";
		
		System.out.print("input age: ");
		
		int age =  sc.nextInt();
		
		System.out.print("input tall(cm): ");
		
		float tall = sc.nextFloat();
		
		System.out.println("--결과--");
		System.out.println("이름 : "+ name );
		System.out.println("성별 : "+ gender2 );
		System.out.println("나이 : "+ age );
		System.out.println("신장 : "+ tall );
		
		

	}

}
