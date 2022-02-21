package org.review_for_wrong_answer;

import java.util.Scanner;

public class EVQuesition {

	public static void main(String[] args) {
		// 엘리베이터가 2 대 있는 빌딩에서 엘리베이터 버튼을 눌렀을 때 한 대의 엘리베이터가 이동하는 프로그램 구현 
		// 1,사용자의 현재 위치를 스캐너로 입력하면 사용자의 위치와 더 가까운 엘리베이터가 이동한다.     >> 더 가까운 사용자의 위치 
		// 2.사용자의 위치와 두 엘리베이터의 위치가 동일 하다면 (내가 5층 엘베1 3층 엘베2 7층 이면 내려 오도록 한다.) 동일하면 내려오도록
		// 3.사용자가 입력한 위치로 엘리베이터의 위치를 바꿔준다 
		// 4.엘리베이터 프로그램을 종료 하려면 q, Q exit,Exit Exit를 입력 
		
		
		
		//for문, scanner, .equals() , LOWER,UPPER 
		

		
		
		
		int elvA = 10; // 엘베A의 위치 10층
		int elvB = 4;  // 엘베B의 위치 4층
		Scanner sc = new Scanner(System.in);
		
		
// 엘리베이터 값을 어떻게 바꿀까
//엘리베이터를 A 가 움직이면 엘베A를 Y값으로 초기화 
		
		for(int i = 0; i<10; i++) {	
		
			System.out.println("================주석 부르즈 할리파=================");
			System.out.println("엘베 A의 현재 위치" + elvA + " 층");
			System.out.println("엘베 B의 현재 위치" + elvB + " 층");
			System.out.print("몇층에 계시나요? [종료하시려면 \"Q\" 또는 \"EXIT\"입력]: ");
			
			String x = sc.nextLine();
				if( x.equals("q") || x.equals("Q") || x.equals("Quit") || x.equals("EXIT") || x.equals("Exit") || x.equals("eXIt")) {
					System.out.println("프로그램이 종료되었습니다.");
				}else if (isNumber(x)) { //숫자
					int Y = Integer.parseInt(x);
					System.out.println(Y + "층에서 엘리베이터를 호출 합니다.");
					if (Math.abs(elvA-Y) > Math.abs(elvB-Y)) {
						System.out.println("승강기 B가 " + Y + "층으로 이동하였습니다.");
						elvB = Y;
						}else if(Math.abs(elvA-Y) < Math.abs(elvB-Y)) {
							System.out.println("승강기 A가 " + Y + " 층으로 이동하였습니다");
							elvA = Y;
							}else if(Math.abs(elvA-Y) == Math.abs(elvB-Y)) {
								if (elvA > elvB){
									System.out.println("승강기 A가" + Y + "층으로 이동하였습니다.");
									elvA = Y;
									}else if (elvA < elvB){
										System.out.println("승강기 B가" + Y + "층으로 이동하였습니다.");
										elvB = Y;
										}
								}
				}else { 
					System.out.println("잘못 입력 되었습니다.");
				}

			   	
		
		/* 현재위치 - A 가 현재위치 -B 보다 크다면 현B가 와야한다
	     현A > 현B   는 엘베B 
	     현B > 현A   는 엘베A */ //개
			 

					
						
} // main 
		//
	}
	static boolean isNumber(String str) {
		boolean result = true;
		// null, 공백일시
		if (str == null || str.length() == 0) {
			result = false;
		}
		// null이나 공백이 아닐시
		else {
			for (int i = 0; i < str.length(); i++) {
				int c = (int) str.charAt(i);
				// 숫자가 아니라면
				if (c < 48 || c > 57) {
					result = false;
				}
			}
		}
		return result;
	}
	
	
	
}