package org.opentutorials.javatutorials.object;

public class CalculatorDemo2 {
	 
	//refactoring > 간소화 
	//Demo 1과 같다
	
	
	
    public static void sum(int left, int right) {    // sum이라는 메소드 정의 
        System.out.println(left + right);			 // << 내용만 바꾸면 sum의 내용을 수정하기 용이하다
    }
 
    public static void main(String[] args) {       
        sum(10, 20);
        sum(20, 40);
    }
 
}