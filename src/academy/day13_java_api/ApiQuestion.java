package day13_java_api;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

public class ApiQuestion {
	public static void main(String[] args) throws ParseException {
		// 다양한 날짜 포멧 적용 
		// 다양한 디지털 시계가 있다 
		// 1. 2022/03/17 14:17:20
		// 2. 2022-03-17 오후 02:17:20
		// 3. 2022.03.17 PM 02:17:20
		// 4. 목 오후 02:17:20
		// 5. 목요일 오후 02:17:20
		// 6. Thu PM 02:17:20
		//  이렇게 만들어 보자 
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		Date date = new Date();
		String strDay = sdf.format(date);
		System.out.println("1. " + strDay);
		// 2
		sdf = new SimpleDateFormat("yyyy-MM-dd a hh:mm:ss" );
		strDay = sdf.format(date);
		System.out.println("2. "+ strDay);
		// 3
		sdf = new SimpleDateFormat("yyyy.MM.dd a hh:mm:ss" ,new Locale("en", "US"));
		strDay = sdf.format(date);
		System.out.println("3. "+ strDay);
		// 4
		sdf = new SimpleDateFormat("E a hh:mm:ss");
		strDay = sdf.format(date);
		System.out.println("4. "+ strDay);
		// 5
		sdf = new SimpleDateFormat("EEEE a hh:mm:ss");
		strDay = sdf.format(date);
		System.out.println("5. "+ strDay);
		// 6
		sdf = new SimpleDateFormat("E a hh:mm:ss",new Locale("ENGLISH"));
		strDay = sdf.format(date);
		System.out.println("6. "+ strDay);

		// 현재 미국 날짜는 ?
		sdf = new SimpleDateFormat("yyyy/MM/dd E a hh:mm:ss",new Locale("ENGLISH"));
		TimeZone timeZone = TimeZone.getTimeZone("America/New_York");
		sdf.setTimeZone(timeZone);
		strDay = sdf.format(date);
		System.out.println("7. "+ strDay);
		
		System.out.println("\n======================== 타입 변경 (형 변환)=========================");
		// 아주 아주 중요한
		// 날짜(타입)을 문자열(타입)으로 바꾸기 

		String strVal = "100";
		String strVal1 = "50";
		// 문자열을 int 타입으로 바꿔 연산을 해야 하듯 데이터 타입도 연산하려면 형 변환 해줘야 한다.
		
		String strTomorrow = "2022-03-18 14:23:22";
		sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"); // 위와 형식을 꼭 맞춰 줘야함
		
		Date dateTomorrow = sdf.parse(strTomorrow); // .parse(date타입) 문자열을 DATE 타입으로 변환 
		// 해당 문자열 날짜로 세팅된 Date 객체
		
		System.out.println(dateTomorrow);
		
		// 다양한 문자열 
		// "시간만" 
		String strTime = "11:20:33";
		sdf = new SimpleDateFormat("HH:mm:ss"); // 날짜를 입력받지 않아 디폴트 값인 1970 01/01이 기준이 되어 Thu Jan 01 이 나옴
		Date dateTime = sdf.parse(strTime);
		
		System.out.println(dateTime);
		
		// "날짜만"
		String strYear = "2022.03.17";
		sdf = new SimpleDateFormat("yyyy.MM.dd");
		Date dateYear = sdf.parse(strYear);
		
		System.out.println(dateYear); // 문자열에 포함되어 있지 않은 시,분,초,밀리초는 디폴트 값인 0으로 되어있다
		
		System.out.println("\n========================== 날짜 세팅 ===============================");
		
		// 날짜 세팅하기
		sdf = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss");
		Calendar cal = Calendar.getInstance(); // 위에서 부른 객체를 이름만 바꿔서 불러옴 
		cal.set(2021, 2, 14, 12, 30, 21);
		String printCal = sdf.format(cal.getTime());
		// 월(MONTH)의 경우 1월이 0 2월 3 3월 4... 인덱스 처럼 0부터 시작 3월이 출력되길 원한다면 2를 넣어야함
		System.out.println(printCal);
		
		// "Date 타입을 Calendar로 변환" 
		Date temp = new Date();
		cal.setTime(temp);
		System.out.println(sdf.format(cal.getTime()));
		
		System.out.println("\n========================== 날짜 연산 ===============================");
		
		// 위에서 사용한 dateTime과 dateYear을 이용 
		long diffMillSec = dateTime.getTime() - dateYear.getTime();
		System.out.println(diffMillSec);
		
		long diffSec = diffMillSec / 1000;
		System.out.println(diffSec);

		long diffMin = diffSec / 60;
		System.out.println(diffMin);
		
		long diffOur = diffMin / 60;
		System.out.println(diffOur);
		
		long diffDay = diffOur / 24;
		System.out.println(diffDay);
		
		long diffYear = diffDay / 365;
		System.out.println(diffYear);
		
		long diff = diffMillSec / (1000 * 60 * 60 * 24);
		System.out.println(diff / 365);
		
		// Calendar 사용 
		// 날짜를 기준으로 더하거나 뺀다고 했을때 유용
		
		// Calendar = 싱글톤 / 여기저기서 사용 가능
		cal.setTime(new Date()); // 이렇게 쓰면 현재 날짜로 초기화 시키고 사용 가능 
		System.out.println(sdf.format(cal.getTime()));
		
		// 3일 뒤라면 ?
		cal.add(Calendar.DATE, 3);
		System.out.println(sdf.format(cal.getTime()));
		
		// 열 한달 뒤 
		cal.add(Calendar.MONTH,11);
		System.out.println(sdf.format(cal.getTime()));
		
		// 7일 전 
		cal.add(Calendar.DATE, -7);
		System.out.println(sdf.format(cal.getTime()));
		
		// "Calendar를 Date로 변환"
		
		Date dateCal = cal.getTime();
		System.out.println(sdf.format(dateCal));
		
		
		
		
		
		
		
	}
}
