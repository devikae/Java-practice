package org.opentutorials.javatutorials.operator;

import org.opentutorials.javatutorials.variable.string;

public class Arithmetic {

	public static void main(String[] args) {
		// 대입, 산술, 비교, 논리 연산자 등이 있다.  산술 연산자(+ - * / %) 
		
		int result = 1 + 2;
		System.out.println(result);  // 값은 3 
		
		result = result - 1;
		System.out.println(result); // 값 2 
		
		result = result * 2;
		System.out.println(result);  // 값 4
		
		result = result / 2;
		System.out.println(result); // 값 2
		
		result = result + 8;
		System.out.println(result); // 값 10
		
		result = result % 7;
		System.out.println(result); // 값 3 
		
		// 나머지 연산자 
		
		int a = 3;
		
		System.out.println(0%a); // 0을 3으로 나눈다 > 0
		System.out.println(1%a); // 1을 3으로 나눈 나머지 > 1
		System.out.println(2%a); // 2을 3으로 나눈 나머지 > 2
		System.out.println(3%a); // 3을 3으로 나눈 나머지 > 0
		System.out.println(4%a); // 4을 3으로 나눈 나머지 > 1
		System.out.println(5%a); // 5을 3으로 나눈 나머지 > 2
		System.out.println(6%a); // 6을 3으로 나눈 나머지 > 0
        
		//이렇게 나눈 나머지 값을 화면에 출력 
		// 나머지를 잘 쓰면 순환하는 값을 만들 수 있다.
		
		
		// 더하기 연산자 
		
		String firstString = "This is";
		String secondString = " a concatenated string.";
		String thirdString = firstString + secondString;
		System.out.println(thirdString);                   // 문자와 문자를 결합 할 때 더하기 연산자를 사용하면 된다.
		
		
	}

}
