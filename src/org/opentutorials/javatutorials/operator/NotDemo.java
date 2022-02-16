package org.opentutorials.javatutorials.operator;

public class NotDemo {

	public static void main(String[] args) {
		// boolean의 값을 역전 시킨다 not의 의미인 !를 붙여서 
		if (!true) {
			System.out.println(1);  // !를 붙여 true를 반대로 만든다 > false 출력X
		}
		if (!false) {
			System.out.println(2); // 위와 반대 
		}

	}

}
