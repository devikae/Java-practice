package submit03;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;

import day11_class.UtilClass;

public class DateBoardMain {

	public static void main(String[] args) throws ParseException {
		ArrayList<DateBoard> dbList = new ArrayList<DateBoard>();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss");

		for(int i = 0; i < 30; i++) {
			int randMonth = (int)(Math.random() * 3) + 1;		// 1~3
			int randDay = (int)(Math.random() * 28) + 1;		// 1~28	
			Calendar cal = Calendar.getInstance();
			cal.set(2022, randMonth-1, randDay);
					
			String strDate = sdf.format(cal.getTime());
			dbList.add(new DateBoard(i + "번째 생성된 글", strDate));
		}
				
		for(int i = 0; i < dbList.size(); i++) {
			System.out.println(dbList.get(i));
		}
		System.out.println("=================================================================");
		
		String strYear = "2022.03.17";
		sdf = new SimpleDateFormat("yyyy.MM.dd");
		Date dateYear =sdf.parse(strYear);
		
		
		for(int i = 0; i < dbList.size(); i++) {
			boolean swapped = false;
			for(int j = 0; j<dbList.size()-1-i; j++) {
				Date date = sdf.parse(dbList.get(j).getDate());
				Date date2 = sdf.parse(dbList.get(j+1).getDate());
				long x = date.getTime() - dateYear.getTime();
				long y = date2.getTime() - dateYear.getTime();
		
				if(x > y){
					DateBoard temp = dbList.get(j);
					dbList.set(j, dbList.get(j + 1));
					dbList.set(j + 1, temp);
					swapped = true;
				}

			}
		}
		for(int i = 0; i < dbList.size(); i++) {
			System.out.println(dbList.get(i));
		}
		Date today = new Date();
		System.out.println("==============================================================");
		for(int i = 0; i < dbList.size(); i++) {
			Date date = sdf.parse(dbList.get(i).getDate());
			long y =( today.getTime() - date.getTime() ) ;
			y = y / (1000 * 60 *60 *24);
			if(y < 30) {
				System.out.println(dbList.get(i));
			}
		}
		
	}

}

