package org.opentutorials.javatutorials.method;

public class MethodDemo3 {
	
	//여러개의 입력값을 만들고 싶다면
	//호출할 때 인자값을 배치하고 인자를 받을 매개변수를 인자에 따라 배치한다
	
	
	
	 public static void numbering(int init, int limit) {
	        int i = init;
	        while (i < limit) {
	            System.out.println(i);
	            i++;
	        }
	    }
	 
	    public static void main(String[] args) {
	        numbering(1, 5); 
	        //1 = init 5=limit 
	    }
	 
	}


