package org.opentutorials.javatutorials.compare;

public class EqualAndNot {

	public static void main(String[] args) {
		// Boolean은 참과 거짓을 의미하는 데이터 타입 >> 두개의 값만 가짐 true/false 
		
		// 비교(관계) 연산자 "=="  >> 조건문에서 많이 사용하게 될 것.
		
		System.out.println(1==2);          // false
		System.out.println(1==1);          // true
		System.out.println("one"=="two");  // false
		System.out.println("one"=="one");  // true 
		
		// "!=" !는 부정을 의미한다. 
        
		System.out.println(1!=2);          // true 1과 2는 같지 않기 때문에 
		System.out.println(1!=1);          // false
		System.out.println("one"!="two");  // true
		System.out.println("one"!="one");  // false 
		
	}

}
