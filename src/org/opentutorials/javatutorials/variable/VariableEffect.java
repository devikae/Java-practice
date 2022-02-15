package org.opentutorials.javatutorials.variable;

public class VariableEffect {

	public static void main(string[] args) {
		System.out.println(100 + 10);
		System.out.println((100 + 10) / 10);
		System.out.println(((100 + 10) / 10) - 10);
		System.out.println((((100 + 10) / 10) - 10) * 10);
		
		
		
		// "중복의 제거" >> 가독성 상승, 유지보수 용이
	    // 고정적인것과, 가변적인것을 잘 구분해서 구룹화 하면 용이하다. 
		// 효율성을 추구하자.
		
		
		
		int a, b;
		a = 100;
		b = 10;
		System.out.println(a + b);
		System.out.println((a + b) / b);
		System.out.println(((a + b) / b) - b);
		System.out.println((((a + b) / b) - b) * b);
		
		
		
		
	}

}
