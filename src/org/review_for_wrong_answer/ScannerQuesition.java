package quesition;

import java.util.Scanner;

public class ScannerQuesition {

	public static void main(String[] args) {
		//삼각형의 (넓이 = (밑변 * 높이) /2) 를 입력받아 구하고 소숫점 2자리 출력 
		//String.format(%자리수, 변수이름)

		Scanner sc = new Scanner(System.in);

		int x, y ;
		double sum;
		
		System.out.println("--입력--");
		System.out.println("**** 삼각형의 넓이 구하기 ****");
		
		System.out.print("밑변 : " );
		x = sc.nextInt();
		
		System.out.print("높이 : ");
		y = sc.nextInt();
		
		sum = (x * y) /2;
		
		System.out.println("--출력--");
		System.out.println("넓이 : " + (String.format("%.2f", sum)));
		
		
	}

}
