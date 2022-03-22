package day14_exception;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Pattern;


// 에러 처리할 메소드들을 가지는 클래스 
public class ExMethod {
	
	// 입력받은 두 숫자를 나눈 값 리턴
	public static double divide(int numA, int numB) throws BizException {
		if(numB == 0) {
			//
			throw new BizException("numB는 0 이외의 숫자를 입력해라");
		}else {
			return  numA/numB;
		}
	}
	
	// 입력 받은 이름을 콘솔에 출력하는 메소드
	// 만약 입력받은 이름이 숫자거나, empty면 throw BizException
	
	public static void showName(String name) throws BizException {
		String regex = "[a-zA-Z가-힣]*";
		
		if(name.length() == 0) {
			throw new BizException(ErrConstants.API_0001 + "이름을 한 글자 이상 입력해 주세요.  \n입력한 값: " + name);
			
		}else if(!Pattern.matches(regex, name)) {
			throw new BizException("API_0002", "숫자를 입력하지 마세요. \n입력한값: "+ name);
		}
		System.out.println(name);
	}
	
	// 날짜 문자열을 입력하면 밀리초로 바꿔서 리턴 
	// 날짜 포맷 yyyy.MM.dd
	
	public static long dateMillSec(String date) throws ParseException {
		SimpleDateFormat sdf= new SimpleDateFormat("yyyy.MM.dd");
		Date temp = sdf.parse(date);
		return temp.getTime();

	}
	
	
	
}
