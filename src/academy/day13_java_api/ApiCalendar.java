package day13_java_api;

import java.util.Calendar;

public class ApiCalendar {
	
	int year;
	int month;
	
	public ApiCalendar(int year, int month) {
		this.year = year;
		this.month = month;
	}
	
	public void drawCal() {
		
		System.out.println(this.year + "년" + this.month + "월 달력");
		System.out.println("일\t월\t화\t수\t목\t금\t토");
		
		Calendar calendar = Calendar.getInstance();
		
		int currentDay = 1;
		calendar.set(this.year, this.month - 1, 1);
		int lastDay =calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
		int startDay = calendar.get(Calendar.DAY_OF_WEEK);
		
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
	}
	
}
