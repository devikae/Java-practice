package org.opentutorials.javatutorials.array;

public class ForeachDemo {	
		
			
	
	 public static void main(String[] args) {
	        String[] members = { "최진혁", "최유빈", "한이람" };
	        for (String e : members) {
//   for each문에서  	 " : " 콜론 뒤에 따라오는 변수값은 하나씩 꺼내서 담아주게 되어있다.
	            System.out.println(e + "이 상담을 받았습니다");
	        }
	    }
	 
	}