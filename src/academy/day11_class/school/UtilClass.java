package day11_class.school;
/**
 * 유용한 함수들을 제공하는 클래스 
 * @author dev-ikae
 *
 */
public class UtilClass {
	
	public static String owner = "만든이 : dev-ikae";
	
	
	
	/**
	 * 입력한 실수를 소수 n번째 잘로 리턴해주는 함수 
	 * @param douNum 반올림 하고 싶은 실수 
	 * @param n 반올림 하고 싶은 자리 
	 * @return 반올림 된 실수 
	 */
	public static double round(double douNum, int n) {
		//소수 두번째 자리에서 반올림해서 
		//소수 첫번째 자리를 만들고 싶다. (n = 1) 
		//3.141592 X10 후 Math.round를 적용하고 다시 나누기 10 
		
		//소수 세번째 자리에서 반올림 해서 
		//소수 두번째 자리를 만들고 싶다면???? (n = 2)
		//3.141592 X100 후 Math.round를 적용 하고 나누기 100
		
		
		//EX)  douNum = 3.141592, n = 2 라고 가정 한다면 
		
		int one = 1;
		for(int i = 0; i < n; i++) {
			one *= 10;
		}
		
		
		double mul = douNum * one;  // 
		long longNum = Math.round((mul));
		double douVal = (double)longNum / one;
		return douVal;
	}
	/**
	 * 연봉액수(int, 단위 만)가 들어오면 깔끔한 
	 * 문자열 (String)로 바꿔서 리턴해주는 함수 
	 * @param salary
	 * @return
	 */
	public static String formatSalary(int salary) {
		if(salary < 10000) { //연봉 1억 미만
			String str = salary + "";
			return str.substring(0,1) + "," + str.substring(1) + "만원";
													// .substring(1이면 1부터 쭉 출력)
		}else {
			int uk = salary/10000;
			int remain = salary%10000;
			
			if(remain < 1000) {
				return uk + "억 " + remain + "만원";
			}
			
			String temp = remain + "";
			
			return uk + "억" + temp.substring(0,1) + "," + temp.substring(1) + "만원";
		}
		
	}


}
