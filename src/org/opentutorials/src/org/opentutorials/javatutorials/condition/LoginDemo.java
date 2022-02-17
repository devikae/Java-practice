package org.opentutorials.javatutorials.condition;

public class LoginDemo {

	public static void main(String[] args) {
		// 사용자가 입력한 아이디 값을 체크하는 프로그램을 만드는 강의 
		
		String id = args[0]; // "args[0]" 이 부분은 아직 배우지 못한 영역 "입력 값" 은 문자열의 데이터 방식
		if(id.equals("egoing")) {              // .equals > 입력 값이 egoing과 같으면 T 아니면 F   따라서 아래와 같이 
			System.out.println("RIGHT");      //  입력한 값이 egoing 이라면 True 로 then절 RIGHT 출력
		}else {
			System.out.println("WRONG");      // 입력한 값이 F일 시 else절 WHRONG 절 출력 
		}
		
		}

	}


