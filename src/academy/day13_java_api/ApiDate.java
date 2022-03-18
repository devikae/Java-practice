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
		Calendar calToday = Calendar.getInstance(); // 
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
		
		System.out.println("====================================================================================");
		
				SimpleDateFormat sdf
				= new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
				
		
		// Calendar의 getInstance()는 싱글톤이 아니라
		// 새로운 Calendar 객체를 생성한다.
		Calendar calTest = Calendar.getInstance();
		// new Date() 처럼 실행될 당시의 시간이 세팅된 객체가 생성됨.
		System.out.println(sdf.format(calTest.getTime()));
		
		calTest.add(Calendar.DATE, 1);
//		try {
//			Thread.sleep(2000);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
		
		// 요약 : Window - Preferences - Java - Code Style
		// - Code Templates - Code - Method body 에서
		// Edit 후 주석 부분 제거.
		
		System.out.println(sdf.format(calTest.getTime()));
		Calendar calTest2 = Calendar.getInstance();
		System.out.println(sdf.format(calTest2.getTime()));
		System.out.println(calTest.hashCode());
		System.out.println(calTest2.hashCode());
		
		System.out.println("================================================ 달력 만들기 ===============================================");
		// 달력 만들기
		
		int year = 2022;
		int month = 4;

		Calendar calendar = Calendar.getInstance();
		// 0부터 시작이기 떄문에 month에서 -1 값 3이 4월이기 때문에
		calendar.set(year, month - 1, 1);
		System.out.println(sdf.format(calendar.getTime()));

		// 해당 달의 마지막 일(DATE)을 리턴 
		int lastDay =calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
		System.out.println(lastDay);
		// 해당 달의 시작 요일; 1:일 2:월 .... 7:토
		int startDay = calendar.get(Calendar.DAY_OF_WEEK);
		System.out.println(startDay);  // 6 >> 금요일 >>>> 1일은 금요일 시작 
		
		System.out.println(year + "년" + month + "월 달력");
		System.out.println("일\t월\t화\t수\t목\t금\t토");
		
		int currentDay = 1;
		
		for(int i = 1; i <= 42; i++) {
			if(i >= startDay) {
				System.out.printf("%2d\t",currentDay);
									
				currentDay += 1;
				
				if(currentDay > lastDay) {
					break;
				}
			}else {
				System.out.print("\t");
			}
			if(i % 7 == 0) {
				System.out.println();
			}
		}
		
		ApiCalendar apciCal = new ApiCalendar(2022, 4);
		// 달력을 만들어주는 클래스를 만들자 
		// ApiCalendar apciCal = new ApiCalendar(2022,4)
		// apiCal.drawCal(); 
		System.out.println();
		apciCal.drawCal();
		
	}
}
