package org.opentutorials.javatutorials.loop;

public class WhileDemo2 {

	public static void main(String[] args) {
		int i = 0;
		// i의 값은 10보다 작다면 true, 크다면 false가된다. 
		// 현재 i의 값은 0
		while ( i < 10 ) {
			System.out.println("coding everybody" + i); // i가 10보다 작기 때문에 true 
			i++; // 출력 후 i + 1 >> i의 값이 9 까지 출력 
		}
		
		int a = 10;
		
		while ( a > 0) {
			System.out.println("coding" + a);
			a--;
		}

	}

}
