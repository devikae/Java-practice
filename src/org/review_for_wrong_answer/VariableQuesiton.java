package quesition;

import java.util.Scanner;

public class VariableQuesiton {

	public static void main(String[] args) {
		// 3과목의 점수를 입력 받아 함계점수와 평균점수(소수점1자리) 출력 
		int kor, math, eng ;
		
		String name;

		
		String [] subject = { "언어", "수리", "영어"};
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("--입력--");

		System.out.print("input 이름 : " );
		name = sc.nextLine();

	    System.out.print(subject[0] + " 점수는 : " );
	    kor =sc.nextInt();
	    
	    System.out.print(subject[1] + " 점수는 : ");
	    math =sc.nextInt();
	    
	    System.out.print(subject[2] + " 점수는 : ");
	    eng =sc.nextInt();
	    
	    double score = (kor + math + eng) /3.0;
	    
	    System.out.println("--출력--");
	    
	    System.out.println("이름 : " + name );
	    System.out.println("합계점수 : " + (kor + math + eng));
	    System.out.println("평균 점수 : " + (String.format("%.1f", score)));
	    
	    if (score >= 90) {
	    	System.out.println(name + "님의 등급은 A 입니다.");
	    }else if (score >= 80) {
	    	System.out.println(name + "님의 등급은 B 입니다.");
	    }else if (score >= 70) {
	    	System.out.println(name + "님의 등급은 C 입니다.");
	    }else {
	    	System.out.println(name + "님의 등급은 D 입니다.");
	    }
	}

}
