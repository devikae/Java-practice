package org.opentutorials.javatutorials.method;

public class MethodDemo2 {
	
	//메소드의 입력과 출력 
	
	//고정적인것과 가변적인것을 생각하며 프로그래밍
	
	
	
	public static void numbering(int limit) {
		int i = 0;              //입력을 위한 도구 "매개변수"
		while (i < limit) {
			System.out.println(i);
			i++;
			
		}
	}


	public static void main(String[] args) {
		numbering(4); //넘버링 메소드를 호출 
		// 호출할 때 ()안의 숫자를 limit에 담아 출력
		// () < 입력을 위한 변수 "매개변수" 
		// ()안에 들어가는 것 "인자"
	}
}
