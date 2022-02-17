package org.opentutorials.javatutorials.loop;

public class SwitchDemo {

	public static void main(String[] args) {
		
		
	        switch(1){ // 괄호 안의 숫자인 케이스를 실행 break가 없다면 case1,2,3모두 실행 
	             //스위치 조건에 해당되는 값으로 들어갈 수 있는 데이터 타입이 정해져있다.
	          //byte, short, char, int, enum, String, Character, Byte, Short, Integer 
	        
	        case 1:
	            System.out.println("one");	            
	        case 2:   // 만약 위 switch(2)라고 한다면 2,3이 출력
	            System.out.println("two");
	            break;
	        case 3:
	            System.out.println("three");
	        default:
	        	System.out.println("default"); // case에 해당하지 않는 조건이 들어오면 디폴트 값이 출력된다 ex4
	            
	        }
	         
	  // switch 문과 if문은 대체 가능하다
	        
	     int val = 1;
	     if (val == 1) {
	    	 System.out.println("one");
	    	 
	     }else if( val == 2) {
	    	 System.out.println("two");
	    	 
	     }else if ( val == 3) {
	    	 System.out.println("three");
	     }
         	        
	    
	 
 }
}