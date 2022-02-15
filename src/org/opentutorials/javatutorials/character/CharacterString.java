package org.opentutorials.javatutorials.character;

public class CharacterString {

	public static void main(String[] args) {
		System.out.println('배'); // 문자는 '작은 따옴표'로 감싸야 한다
		System.out.println("배"); 
		System.out.println("배 불러"); // 문자 열은 "큰 따옴표로" 
		System.out.println("배 부르면"+" 졸리다"); // 문자열도 결합 가능 
		System.out.println("1+2="); //큰 따옴표가 없으면 숫자로 인식하기 때문에 바로 결과 값이 나오게 된다
		System.out.println(1+2);   //자바에서 따옴표가 없는 숫자는 숫자로 인식한다, 그래서 컴파일 하면 연산한 결과 3으로 나옴
		System.out.println(1.2+1.3);
	    System.out.println('1'+'2');  // 이건 왜 12가 아니고 99로 나올까? 아스키코드에서 1=49 2=50 문자로 덧셈을 하니 2진수로 계산되어 나오는듯 친구가 알려줌
	    System.out.println("1"+"2");  
		System.out.println(2*2);   // 곱하기
		System.out.println(4/2);   // 나누기
		
		System.out.println("egoing said\"welcome programming world\"");
		System.out.println("ikae said \n \"배부르면 졸리다\"");
		System.out.println("java를 \n잘할수 \n있을까?");
		
	}

}
