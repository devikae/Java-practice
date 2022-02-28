package submit;

public class Submit08 {

	public static void main(String[] args) {
		
		//어떻게 풀어야 할까 
		
		//for
		
		//a를 문자열 끝까지 각각 한글자씩 비교 후 카운트 반복
		//어떻게 자르고 비교할까? 
		//이퀄 (==)  같다면 변수에 +1 
		
		int count = 1;
		String example = "aaabbcdddaeefffffgg";
		String ans = "";
		
		for ( int i  = 0; i < example.length()-1; i++ ) {
			if ( example.charAt(i) == example.charAt(i + 1) ) {
				count++;
			} else {
				ans += example.charAt(i) + (count + "");
				count = 1;
			}
		} 
		System.out.println(ans);
		
	}
}