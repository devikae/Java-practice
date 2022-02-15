package org.opentutorials.javatutorials.type_conversion;

public class ImplictConversion {

	public static void main(String[] args) {
		//형 변환이란 int라는 타입을 필요에 따라 double이나 float같은 데이터 타입으로 변환하는 것 
		//정수 200과 실수 200.0의 bit값은 다르다 따라서 정수200과 실수200.0을 연산하려하면 한쪽의 데이터 타입을 맞춰야 한다 
		
		
		double a = 3.0f;
		//변수는 double 데이터는 float 이런 경우 자동으로 형변환 한다. (암시적 형 변환)
		//위와 같은 경우는 float 타입이 double의 범위에 속할 수 있기 때문에 형 변환을 해도 데이터 손실이 일어나지 않는다.
		
		
//      float a = 3.0;
       //위와 달리 float 데이터에 더블형의 데이터 값을 담으려고 하고 있다 >> 오류 발생 
	   //위와 반대로 double은 float보다 담을 수 있는 범위가 더 크기 때문에 손실이 발생할 우려가 있어 자동 형 변환이 일어나지 않는다.
	
		
//위에서 알 수 있듯이 자동 형 변환은 표현범위가 좁은데이터 타입에서 넓은 데이터 타입으로의 변환만 가능하다 
// byte > short, char > int > long > float > double 순서대로 자동 형 변환이 가능하며 반대로는 불가능 하다.
// 실수>정수로 형변환 불가 char 같은 경우 유니코드 값으로 형 변환.
		
		int b = 3;              // 정수 3
		float c = 1.0f;         // 실수 1.0
		double d = b + c;       // 이 경우 자동 형 변환이 일어난다
		                        // 정수를 3.0f로 형 변환 + 1.0F = 4.0F를 d라는 변수에 대입 d는 double 타입
		
	

	}

}
