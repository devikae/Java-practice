package org.opentutorials.javatutorials.condition;

public class Condition3Demo {

	public static void main(String[] args) {
		// if-else if 뒤에 따라오는 값이 True면 then절 실행 False면 else절 실행 
		
		if (true) {
			System.out.println(1);      // true 이기 때문에 1만 출력 
		} else {
			System.out.println(2);
		
		}
		
		if (false) {
			System.out.println(1);      // false 이기 때문에 then절인 1 출력X 
		} else { 
			System.out.println(2);       // false 이기 때문에 else절의 2 출력 
		
		}
		
		
		// else if 
		// if 절 값이 T라면 then절이 실행 > F라면 else if 절로 제어가 넘어감 
		// else if 절 값이 T라면 else if then절 실행 > F라면 else 절 실행 
		// else절은 항상 맨 마지막에 나와야함 
		
		
//		   if (t/f) {
//		               "then"          < if가 T일 시 실행 
//   	} else if (t/f){  
//                      "else if then"  < else if가 T일 시 실행 
//      } else{
//		                "else"          < else if가 F일 시 else절 실행  
//      }
		
		if(false) {
			System.out.println(1);
		} else if (true) {
		    System.out.println(2);      // < 얘만 출력 얘를 False로 바꾸면 아래3이 출력 두 else if문 전부 false 일 시 else문의 4 출력
		}    else if (true) {           //내려가는 과정에서 true가 발견되면 첫 true가 발견된 구간만 실행되고 그 아래는 true 여도 실행 X
			System.out.println(3);
		}	else {
			System.out.println(4);
		}
		
		
		// 아직까진 조건문 같지 않다 T/F가 유동적으로 바뀔수 있어야만 조건문으로서 가치가 있다.
		
		
		
		
		
		
	}
	
	

}
