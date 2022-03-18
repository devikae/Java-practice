package day13_java_api;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class D_dayCal {

	public static void main(String[] args) throws ParseException {
		// 디데이 계산기
		// 파라미터로 날짜를 입력 받으면 (String, yyyy.MM,dd 포맷)
		// 오늘 날짜와 해당 날짜의 차이를 비교하여 차이 값을 리턴

		// 2022.04.01 이 오늘부터 몇일 남았는지
		// 2022.02.14 부터 몇일 지났는지 계산되서 출력될 수 있게 만들어보기

		// 어떻게 만들어야할까
		// 함수로, 리턴해야하고, 파라미터로 들어온 값을 DATE타입으로 변경.
		// 현재 날짜와 들어온 파라미터(DATE)를 계산 한 후 리턴
		Scanner sc = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);
		System.out.println("디데이 계산기");
		System.out.println("1. 날짜 입력 | 2. 종료 ");
		System.out.print(">>> ");
		int x = sc.nextInt();

		while (true) {

			if (x == 1) {
				System.out.println("날짜를 입력해주세요. ex) YYYY.MM.DD");
				System.out.print(">>>> ");
				String YYYYMMDD = sc2.nextLine();
				dDayCal(YYYYMMDD);
				break;
			} else if (x == 2) {
				System.out.println("종료 합니다.");
				break;
			} else {
				System.out.println("잘못 입력");
				continue;
			}

		}

//		Calendar c1 = Calendar.getInstance();
//
//		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyyMMdd");
//
//		String today = sdf2.format(c1.getTime());
//
//		Date current = sdf2.parse(today);
//
//		System.out.println(today);

	}

	public static void dDayCal(String date) throws ParseException {
		
		Calendar c1 = Calendar.getInstance();
		
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyyMMdd"); // 형식지정
		
		String today = sdf2.format(c1.getTime());
		
		Date current = sdf2.parse(today); // 시,분,초를 제외한 날짜

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd"); // 데이터 포맷 
		
		Date datetime = sdf.parse(date); // 파라미터로 들어온 문자열을 데이트 타입으로 변환
		
		long result = ( (datetime.getTime() - current.getTime()) / 1000 / 60 / 60 / 24);
		// 현재시간 - 입력날짜 를 일자로 만들기  
		
		if(result < 0) {
			System.out.println("+" + Math.abs(result)+"일");
		}else if (result > 0) {
			System.out.println("D-"+ result);
		}

		// 달력을 만들어주는 클래스를 만들자 
		// ApiCalendar apciCal = new ApiCalendar(2022,4)
		// apiCal.drawCal(); 
		
		
	}
}
