package org.opentutorials.javatutorials.operator;

public class OrDemo {

	public static void main(String[] args) {
		// OR연산자  좌항 || 우항 중 한개만 참이여도 결과 출력
		if (true || true) {
			System.out.println(1);  // 둘 다 true if절 실행 
		}
		if (true || false) { 
			System.out.println(2);  // 둘중 하나라도 true면 if절 실행 
		}
		if (false || true) {
			System.out.println(3);  
		}
		if (false || false)
			System.out.println(4); // 둘 다 false이기 때문에 실행X
	}


	
}
