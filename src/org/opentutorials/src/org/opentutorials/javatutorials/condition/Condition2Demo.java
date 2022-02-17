package org.opentutorials.javatutorials.condition;

public class Condition2Demo {
              
	  public static void main(String[] args) {
		  
		  if (true) {                  // true 일 시 중괄호 안에 있는 내용 실행 
			  System.out.println(1);
			  System.out.println(2);
			  System.out.println(3);
			  System.out.println(4);
			 

			  
		  }
		  
		  System.out.println(5);       // 이 부분"도" 출력
		  
		  if (false) {                 // false 일 시 중괄호 내용 실행 안하고
			  System.out.println(1);
			  System.out.println(2);
			  System.out.println(3);
			  System.out.println(4);
			 

			  
		  }
		  
		  System.out.println(5);       // << 이 부분"만" 실행
}
}

