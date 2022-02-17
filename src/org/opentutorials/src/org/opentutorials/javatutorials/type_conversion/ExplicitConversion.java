package org.opentutorials.javatutorials.type_conversion;

public class ExplicitConversion {

	public static void main(String[] args) {
		// 자동 형 변환이 적용되지 않는 경우 수동으로 형 변환을 해야한다 이를 명시적 형 변환 이라고 한다.
		
	//float a = 100.0; double형을 float형 데이터에 담으려 하기 때문에 자동 형 변환이 일어나지 않아 오류 발생
	//int b = 100.0f;  위와 같은 경우 자동 형 변환이 일어날 경우 데이터 손실이 일어나기 떄문에 오류 발생 
		
		float a = (float)100.0;  //괄호에 float를 넣어 명시적 형 변환을 시킨다
		int b = (int)100.0f;     //위와 같으나 100.1f라고 가정 시 이 처럼 형 변환 하면 0.1은 소실된다.
		
		
  		

	}

}
