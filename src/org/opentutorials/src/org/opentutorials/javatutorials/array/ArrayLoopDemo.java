package org.opentutorials.javatutorials.array;

public class ArrayLoopDemo {

	public static void main(String[] args) {
		// 배열의 사용 
		
		String[] members = { "최진혁", "최유빈", "한이람" };
        for (int i = 0; i < members.length; i++) {
        	               //members.longth에 담긴 총 데이터 개수 [3]
            String member = members[i];
         //문자열을 담는 변수    //처음 실행 된 i의 값은 0  > 최진혁 
// member에 1번으로 최진혁이 담김 // 후에 1 증감 > 최유빈 한이람 출력
// 배열을 사용해 반복문을 작성하면 데이터를 꺼내서 처리를 한다.           
            System.out.println(member + "이 상담을 받았습니다");

	}

}
}
