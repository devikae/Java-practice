package org.review_for_wrong_answer;
import java.util.Scanner;

public class Quesition11 {

	public static void main(String[] args) {
		//2개의 숫자와 연산자를 입력하여 계산하시오
       // 조건1) 실수인경우는 소수이하 2째자리까지 출력하시오
       // 조건2) 연산자가 +,-,*,/ 이외의 문자가 들어오면 
         //      "연산자error"출력하시오

		Scanner sc = new Scanner(System.in);
		
		
		Scanner sc1 = new Scanner(System.in);
	
		
		
		System.out.print("A의 값을 입력하시오 : ");
		int a = sc.nextInt();
		System.out.print("B의 값을 입력하시오 : ");
		int b = sc.nextInt();
		
		System.out.print("연산자 입력(+,-,*,/)");
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
			System.out.println("연산자 error");
		}
		
		
		
		
		

	}

}
