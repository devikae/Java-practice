package org.opentutorials.javatutorials.method;

public class MethodDemo1 {

	
		 public static void numbering() { //정의 " () { " 
		        int i = 0;
		        while (i < 10) {
		            System.out.println(i);
		            i++;
		        }
		    }   // 0~9까지 순차적 출력 
		 
		    public static void main(String[] args) {
		        numbering(); // (); 호출 
		        numbering(); // (); 호출 
		        numbering(); // (); 호출 
		       // 넘버링이라는 이름을 가지고 있는 메소드가 호출된다.
		        
		       //3번 호출함으로써 넘버링의 메소드의 본문이 3번 출력된다.
		    }
		}