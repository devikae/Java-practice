package org.opentutorials.javatutorials.variable;

public class Variable {

	public static void main(string[] args) {
		
		// 변수의 선언과 할당
		// 변수 > 데이터를 담는 컨테이너라고 생각하면 편하다.
		int a;  // int > 데이터의 형식 (정수) a > 변수의 이름    따라서 변수에는 숫자만 들어갈 수 있다고 선언한 것.
		a = 3;  // a라는 변수에 3이라는 값을 대입 한 것.
		System.out.println(a+"1"); //31
		System.out.println(a+1);   //4
		
		a = 2; // a는 2라는 값을 재 할당
		System.out.println(a+3);   //5
		
		a = -3;  
		System.out.println(a*-3);
		
		

	}

}
