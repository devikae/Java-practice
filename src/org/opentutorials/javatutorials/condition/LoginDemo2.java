package org.opentutorials.javatutorials.condition;

public class LoginDemo2 {

	public static void main(String[] args) {
		 String id = args[0];
	        String password = args[1];       // 아직 어떤 문법인지 모르지만 입력 값이고 그걸 ID와 PW 두개의 입력을 받도록 했다.
	        if (id.equals("egoing")) {
	            if (password.equals("111111")) {  //if절이 두개 들어갔다 논리 연산자를 배우면 한개로 가능 다음시간은 논리 연산자 배울 시간.
	                System.out.println("RIGHT");
	            } else {
	                System.out.println("WHRONG");
	            }
	 
	        } else {
	            System.out.println("WHRONG!");
	        }

	}

}
