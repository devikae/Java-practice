package org.opentutorials.javatutorials.operator;

public class PrePost {

	public static void main(String[] args) {
		// 단항연산자 >> +3 (양수) -3 (음수) ++(값을 1증가) --(값을 1감소)
		
		int i = 3;  // i의 값은 3
		i++;       // i + 1
		
		System.out.println(i);  //결과는 i(3) + 1 = 4
		++i;
		System.out.println(i);  //i (4) + 1 = 5
		System.out.println(++i); //i 라는 변수에 1이라는 값을 더한 결과를 괄호 안에 치환해 출력 결과 6
		System.out.println(i++); // i의 값에 1이 더해지기는 하지만 괄호 안에서는 더해지지 않고 다음 결과에 6출력
		System.out.println(i); // 위에서 더한 후 출력되기 때문에 7
		
	}

}
