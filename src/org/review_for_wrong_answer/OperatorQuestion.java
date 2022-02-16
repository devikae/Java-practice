package org.review_for_wrong_answer;

public class OperatorQuestion {

	public static void main(String[] args) {
		// 오늘 수업 시간에 한 예제 문제
		//삼항 연산자를 이용해서 아래의 주민번호 뒷자리의 첫번째 숫자에 따른 성별을 
		//주민번호 뒷자리 숫자가 홀수면 남성, 짝수면 여성 
		
		String hisIdBack = "3231476";
		String herIdBack = "4243654";
		
		int hisFirst = Integer.parseInt(hisIdBack.substring(0, 1)); //인티저를 사용해 문자열을 정수로 변환 
		int herFirst = Integer.parseInt(herIdBack.substring(0, 1)); // 섭스트링을 사용해 맨 앞자리만을 추출
		
	    System.out.println(hisFirst % 2); 
	    System.out.println(herFirst % 2);
	    
	    String hisgender = (hisFirst % 2 == 1) ? "남자" : "여자"; //추출한 값을 2로 나눈 나머지 값이 1이면 남자 출력
	    String hergender = (herFirst % 2 == 1) ? "남자" : "여자"; //나머지 값이 1이 아니면 짝수 여자 출력 
	    System.out.println(hisgender);
	    System.out.println(hergender);
	    


	}

}
