package day14_exception;

import java.text.ParseException;

public class ExceptionMain {

	public static void main(String[] args) {
		int[] intArray = {1, 2, 3};
		
		// 오류나면 프로그램 즉시 종료  웹 > 응답없음 앱 > 종료됨 
		try {
			System.out.println("인덱싱 시작");
			System.out.println(intArray[3]);      // 오류나서 아래 구문 실행이 안됨
			System.out.println("인덱싱 끝");        // 생략되고 캐치로 넘어감
		}catch(Exception e) {
			e.printStackTrace();
			// 에러가 콘솔창에 출력되는 시점과 println으로 콘솔창에 출력되는 시점은 다르다
			System.err.println("난 진돗개야");
			System.out.println("오류났쥬? 개 킹받쥬?");
			// 웹 사이트의 경우 에러사이트로 이동 시켜준다.
		}
		try{
			System.out.println(intArray[3]);
		}catch(java.lang.ArrayIndexOutOfBoundsException e) {
			// 위 처럼 구체적인 예외를 지정할 수 있다.
			System.out.println("인덱스 3은 없습니다");
		}catch(Exception e) {
			System.out.println("나도 모르는 에러");
		}
		System.out.println("배열의 길이: "+ intArray.length);
		
		System.out.println("\n======================================================");
	
		int intA = 3;
		int intB = 0;
		
		try {
			System.out.println(intA/intB);
			System.out.println(intArray[3]);
		}catch(java.lang.ArithmeticException a) {
			a.printStackTrace();
			System.out.println("0으로 나누면 무한이다. 나누지마라.");
		}catch(java.lang.ArrayIndexOutOfBoundsException e) {
			// 각 예외에 대한 다른 처리를 할 수 있다.
			System.out.println("인덱스 3은 없습니다 인덱스 넘기지마");
		}catch(Exception e) {
			System.out.println("모르는에러 ");
		}
		// 충분히 예상되는 에러의 경우 따로 Exception 클래스를 만들어서 처리한다 >> BizException
		System.out.println("\n==============================================================");
		
		try {
			ExMethod.divide(5, 0);
		}catch(BizException e) {
			System.out.println("예측된 에러 발생");
			// 이 타이밍에 서버로 에러 코드와 에러 메세지를 보낸다
//			e.printStackTrace();
			//에러 메세지 읽기
			System.out.println(e.getMessage());
		}catch(Exception e) {
			System.out.println("모르는 에러났쥬?");
		}
		System.out.println("\n===============================================================");
		
		try {
			ExMethod.showName("324673");
		}catch(BizException b) {
			System.out.println("에러코드: " + b.getErrCode());
			System.out.println("에러 메세지: " + b.getMessage());
		}catch(Exception e){
			System.out.println("나도 모르는 에러");
		}
		
		System.out.println("\n===============================================================");
		
		try{
			ExMethod.dateMillSec("20220322");
		}catch(ParseException p) {
			System.out.println("날짜 포맷을 yyyy.MM.dd로 맞춰주세");
		}catch(Exception e) {
			System.out.println("나도 모르는 에러");
		}finally { // 예외 발생 상관 없이 실행됨.
			// 일반적인 명령문의 경우 finally에 굳이 쓸 이유가 없다.
			// 주로 try문에서 사용된 객체를 close할때 이용
			System.out.println("에러가 발생 하던 말던 실행 됨");
		}
		
		
	}

}
