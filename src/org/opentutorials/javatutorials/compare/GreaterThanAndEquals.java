package org.opentutorials.javatutorials.compare;

public class GreaterThanAndEquals {
	public static void main(String[] args) {
		//  > 좌항이 우항보다 크다면 참 그렇지 않다면 거짓 < 반대도 마찬가지 
		
		System.out.println(10>20); //F
		System.out.println(10<20); //F
		System.out.println(10>2);  //T
		System.out.println(10>20); //F
		
		// >= 좌항이 우항보다 크거나 같다. <= 반대도 마찬가지 
		
		System.out.println(10>=20); //F
		System.out.println(10<=20); //T
		System.out.println(10<=2);  //F
		System.out.println(10>=10); //T
		
		
	    // .equals 문자열을 비교할 때 사용하는 메소드. 아직 메소드를 배우지 않음 
		
		String a = "Hello world";              // 둘다 같은 hello world이지만 아래 출력되는 값은 false가 된다
		String b = new String("Hello world");
		System.out.println(a == b);           // false    
		System.out.println(a.equals(b));  
		
		//아직 잘 알지 못하지만 
		//new String 해주는 이유는 그냥 위에 Hello world가 쓰였기 때문에 new String를 통해 다른 위치에 데이터를 생성해
		// a == b 일때 데이터의 위치가 다르기 때문에 false이며 a.equals(b)는 데이터 위치는 다르지만 저장된 데이터의 값이 같으므로 true 
		
}
}