package org.opentutorials.javatoturials.data_type;

public class Constant {

	public static void main(String[] args) {
	//	int a = 1;  //상수란 변하지 않는 값을 의미한다.
	//	1 = 3;      대입 연산자에 의해서 1이라고 지정해도 컴파일 되지 않는다 1은 3이 될 수 없기 때문에, 고유한 값을 가지고 있어서다 
		
		
		float a = 2.2f;  //실수지만 float로 지정되지 않는다
		                 // 뒤에 f를 붙여 float라는 데이터 타입이라는걸 명시적으로 지정해주면 오류가 풀린다. 왜일까

		                 //변수도 데이터 타입이 있고, 상수역시 데이터 타입이 있다.
		                 //이번 강의에서는 기본적으로 실수는 double를 사용하고 float를 사용하려면 뒤에 F를 붙이라는것만 기억할 것
		
		
		long b = 2147483648L;       // 상수의 데이터 타입이 기본형 디폴트값이 int형이기 떄문에 뒤에 L을 붙여 데이터값이 long이라는것을 지정해주는것
        byte c = 100;               // 기본적으로 int형이기 때문에 100은 int형으로 담을 수 있는 수이기 때문에 에러가 발생하지 않는다. 
        short d = 200;              // byte와 마찬가지 
		
		
	}           
	
	

}
