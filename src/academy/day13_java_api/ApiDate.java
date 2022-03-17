package day13_java_api;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class ApiDate {
	public static void main(String[] args) {
		// 현재 시간 
		// "1. DATE 클래스 사용" 
		Date dateToday = new Date();
		// Date객체가 생성되는 순간
		// 해당 Date 객체 내부에 그 때의 시간이 세팅된다.
		System.out.println(dateToday);
		
		// 날짜 포멧 설정
		SimpleDateFormat dateFormat
			= new SimpleDateFormat("yyyy년 M월 dd일 HH시 mm분 ss초");
		String strToday = dateFormat.format(dateToday);
		System.out.println(strToday);
		
//		try {
//			Thread.sleep(2000);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
		
		System.out.println(dateToday);
		Date newDate = new Date();
		System.out.println(newDate);

		// "2.Calendar 클래스 사용" 
		Calendar calToday = Calendar.getInstance(); // 싱글톤으로 된 캘린더를 불러옴 
		System.out.println(calToday);
		System.out.println(calToday.getTime());
		
		// 날짜 포멧 적용
		strToday = dateFormat.format(calToday.getTime());
		System.out.println(strToday);
		
		
		// "3. System 클래스 사용"
		System.out.println(System.currentTimeMillis());
		strToday = dateFormat.format(System.currentTimeMillis());
		System.out.println(strToday);
		
		strToday= dateFormat.format(1647493937666l);
		// .format() 안에 long 타입 정수를 입력하면 1970/01/01 기준 해당 millisec가 지난 날짜로 인식 
		System.out.println(strToday);
		
		System.out.println("=======================================다양한 날짜 타입 만들기=============================================");
		
		// 다양한 날짜 타입 만들기 
		
	}
}
