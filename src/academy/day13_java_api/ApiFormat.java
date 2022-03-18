package day13_java_api;

import java.text.DecimalFormat;
import java.text.MessageFormat;

public class ApiFormat {
	public static void main(String[] args) {
		// 숫자 형식 DecimalFormat
		
		// 자릿수에 맞춰 숫자 앞에 0 붙이기
		// 1이면 001, 11이면 011, 132면 132
		DecimalFormat deciFormat = new DecimalFormat("000");
		
		String strNum = deciFormat.format(1);
		System.out.println(strNum);
	
		System.out.println(deciFormat.format(11));
		System.out.println(deciFormat.format(132));
	
		// 자리수에 맞춰 소수 뒤에 0 붙이기 
		// 0.1 이면 0.100, 0.11이면 0.110, 0.132면 0.132 
		
		deciFormat = new DecimalFormat("0.000");
		
		System.out.println(deciFormat.format(0.1));
		System.out.println(deciFormat.format(0.4423221312));
		System.out.println(deciFormat.format(2.32));
		
		System.out.println("===========================");
		
		// 소수 넷째 자리에서 반올림 
		// 3.141592 ㅡ> 3.142
		deciFormat = new DecimalFormat("#.###");
		System.out.println(deciFormat.format(3.141592));
		
		// 정수 문자열을 정수(int로 바꾸기) Integer.parseInt()
		// 실수 문자열을 실수 (double로 바꾸기) double.parseDouble()
		
		double doubVal = Double.parseDouble("3.1415");
		System.out.println(doubVal);
		
		System.out.println("=================== 천단위마다 , 붙이기==============");
		deciFormat = new DecimalFormat("#,###");
		System.out.println(deciFormat.format(123467890));
		
		// 문자 형식 MessageFormat
		String formatStr = "iD: {0}\n이름: {1}\n연락처: {2}";
		String result = MessageFormat.format(formatStr, "dev-ikae", "ikae", "kk@naver.com");
		System.out.println(result);
		
		formatStr = "Id: %s\n이름: %s\n연락처: ";
		System.out.printf(formatStr,"dev-ikae", "ikae", "kk@naver.com" );
		
		// 문자 형식 포맷 두번째
		Object[] arguments = {"dev-ikae", "ikae", "kk@naver.com"};
	
	}	
}
