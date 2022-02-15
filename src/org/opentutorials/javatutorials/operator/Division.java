package org.opentutorials.javatutorials.operator;

public class Division {

	public static void main(String[] args) {
		// 정수와 실수를 타입별로 나누기한 결과는 어떻게 될까
		int a = 10;
		int b = 3;
		
		float c = 10.0f;
		float d = 3.0f;
		
		System.out.println(a/b); //10을 3으로 나누면 3.33333...이 나와야 하지만 정수 타입 데이터이기 떄문에 소숫점 자리 소실 
		System.out.println(c/d); //10.0f를 3.0f로 나누면 실수의 값에 담았기 떄문에 소수점 자리도 출력 된다
		System.out.println(a/d); //10을 3.0f로 나누면 어떻게 형 변환이 될까 
		// 더 표현 범위가 넓은 데이터 타입으로 형 변환이 되서 10을 10.0f로 형 변환 시켜 연산 그러므로 c/d와 같은 값 출력

	}

}
