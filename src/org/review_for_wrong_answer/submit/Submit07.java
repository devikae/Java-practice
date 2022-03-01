package submit;

public class Submit07 {
	public static void main(String[] args) {
		System.out.println(textMoney(1234567890));
		System.out.println(textMoney(123456789));
		System.out.println(textMoney(12345678));
		System.out.println(textMoney(1234567));
		System.out.println(textMoney(123456));
	} 

	public static String textMoney(long num) {
		String num1 = num + "";
		String result = "";
		
		int len = num1.length(); 
		
		if ( len == 6 ) {
			result = num1.charAt(0) + "십 " + num1.charAt(1) + "만원";
		} else if ( len == 7 ) {
			result = num1.charAt(0) + "백 " + num1.charAt(1) + "십 " + num1.charAt(3) + "만원"; 
		} else if ( len == 8 ) {
			result = num1.charAt(0) + "천 " + num1.charAt(1) + "백 " + num1.charAt(3) + "십 " 
					 + num1.charAt(4) + "만원";
		} else if ( len == 9 ) {
			result = num1.charAt(0) + "억 " + num1.charAt(1) + "천 " + num1.charAt(2) + "백 " + num1.charAt(3) + "십 " 
					 + num1.charAt(4) + "만원";
		} else if ( len > 9 ) {
			result = num1.substring(0,2) + "억 " + num1.charAt(2) + "천 " + num1.charAt(3) + "백 " + num1.charAt(4) + "십 " 
					 + num1.charAt(5) + "만원";
		}
		return result;
	} 
	
}