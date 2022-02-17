package org.opentutorials.javatutorials.array;

public class GetGroupDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] classGroup = {"최진혁", "최유빈", "한이람", "이고잉"}; // 
		System.out.println(classGroup[0]); // 최진혁 출력
		System.out.println(classGroup[1]); // 최유빈(이러한 값들을 원소 라고 한다)
		System.out.println(classGroup[2]); // 한이람
		System.out.println(classGroup[3]); // 이고잉 
		//                       [index]
		
		
		//배열을 정의하는 다른 방법과 배열에 담겨 있는 값의 수를 알아내는 방법
		//관리를 하려면 현재 배열안에 몇개의 데이터가 담겨있는지 알아내는것도 상당히 중요!
		
		String[] classGroup2 = new String[4];
//new를 정의했다 새로운 문자열데이터 타입으로 만들고 [4개의 데이터가 담겨있다] []안에 배열에 담을 숫자
		classGroup2 [0] = "최진혁";
		System.out.println(classGroup2.length); //.length는 배열이 담을 수 있는 원소의 수
		classGroup2 [0] = "최유빈";
		System.out.println(classGroup2.length);// 담겨있는 데이터값을 알려주는게 아닌 담을 수 있는 수의 값을 알려주는것
		classGroup2 [0] = "한이람";
		System.out.println(classGroup2.length); // 그렇기 때문에 출력값은 모두 4
		classGroup2 [0] = "이고잉";
		System.out.println(classGroup2.length);

		
		  /*      length :4
		          최|최|한|이 <
		          진|유|이|고 <  } element (원소)
		          혁|빈|람|잉 <
           index> 0|1,|2|3 
	    */
	} 
}
