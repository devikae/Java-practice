package day13_java_api;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

import day11_class.UtilClass;

public class ApiMath {

	public static void main(String[] args) {
		final double PI = 3.141592;
		// 상수 변수의 이름은 대문자 
		
		// 반올림 
		double roundPI = Math.round(PI);
		System.out.println(roundPI);
		
		// 소수 넷째자리에서 반올림하여 3.142가 나오도록 만들기
		roundPI = Math.round(PI * 1000.0)/1000.0;
		System.out.println(roundPI);  //  >> 3.142
		
		
		// 올림 (소수점 있으면 올림)
		double ceilPI = Math.ceil(PI);
		System.out.println(ceilPI);  // >> 4
		
		// 내림 (소수점 있으면 내림)
		double floorPI = Math.floor(PI);
		System.out.println(floorPI);  // >> 3
		
		// 절대값 
		int q = -332;
		int absi = Math.abs(q);
		System.out.println(absi);     // -332;
		
		//로직으로 절대값 구하기 
		if( q < 0) {
			System.out.println(q * -1);
		}else {
			System.out.println(q);
		}
		
		// 제곱 
		// 10의 8 제곱이라고 할 때 
		double x = Math.pow(10, 8);
		System.out.println(x);  		// 1.0E8     (10^8)
		System.out.println((int)x);
		
		// 7의 4제곱
		x = Math.pow(7,4);
		System.out.println(x);
		
		// 로직으로 제곱 구현 
		// 10의 8제곱 이라면 
		
		long num = 1;
		for(int i = 0; i < 8; i++) {
			num *=10;
		}
		System.out.println(num);
		
		num =1;
		for(int i = 0; i< 4; i++) {
			num *=7;
		}
		System.out.println(num);

		// 제곱근 (루트)
		double sqrtNum = Math.sqrt(num);
		System.out.println(sqrtNum);
	
		// 랜덤 숫자 (난수) 생성
		double randDouble = Math.random();  // 0~1 사이의 실수 생성 (1은 미 포함)
		System.out.println(randDouble);
		
		// 0부터 9까지의 정수 생성 
		int randInt = (int) (Math.random()*10);
		System.out.println(randInt);
	
		// 10부터 20까지 정수 생성
		int randInt2 = (int) (Math.random()*11)+10;
		System.out.println(randInt2);
		
		// a부터 b까지의 정수 생성
		int a = 25;
		int b= 63; 
		randInt = (int)(Math.random()*(b-a+1))+a;
		
		System.out.println("======================================================\n");
		// 랜덤 클래스 
		
		Random random = new Random();   // Math와 달리 따로 객체를 만들어야 하는 불편함이 있다.
		
		// nextInt(n)  >> 0부터 n-1 까지 랜덤한 정수를 반환
		// 0~9까지의 랜덤 정수
		System.out.println(random.nextInt(10));
		
		// 10에서 20까지 랜덤 정수
		System.out.println(random.nextInt(11)+10);
		
		// 랜덤 boolean 값 
		System.out.println(random.nextBoolean());
		
		// 시드 설정
		// 랜덤 난수를 생성할 때 내부적으로 사용되는 값 
		random.setSeed(7);
		for(int i = 0; i<6; i++) {
			System.out.print(random.nextInt(45)+1 +" ");
		}
		System.out.println("================");
		// 유니크 ID 생성
		// Guest2022031823938437598438 님 환영합니다
		// 6자리의 랜덤 숫자를 이용해서 만든다? 
		// >yyyyMMddHHmmssSSS + random 6자리 추가
		
		System.out.println("Guest " + makeID() + "님 환영합니다.");
		System.out.println("Guest " + makeID() + "님 환영합니다.");
		System.out.println("Guest " + makeID() + "님 환영합니다.");
		System.out.println(UtilClass.makeID());
		
	}
	/**
	 * unique id 생성 메소드
	 * @return dev-ikae
	 */
	static String makeID() {
		Date now = new Date();
		SimpleDateFormat sdf= new SimpleDateFormat("yyyyMMddHHmmssSSS");
		Random random = new Random(); 
		String guestid = sdf.format(now);
		
		for(int i = 0; i<6; i++) {
			guestid += random.nextInt(10);
		}
		return guestid;
	}
	
	
	
}



