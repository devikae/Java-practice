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
			result = num1.charAt(0) + "�� " + num1.charAt(1) + "����";
		} else if ( len == 7 ) {
			result = num1.charAt(0) + "�� " + num1.charAt(1) + "�� " + num1.charAt(3) + "����"; 
		} else if ( len == 8 ) {
			result = num1.charAt(0) + "õ " + num1.charAt(1) + "�� " + num1.charAt(3) + "�� " 
					 + num1.charAt(4) + "����";
		} else if ( len == 9 ) {
			result = num1.charAt(0) + "�� " + num1.charAt(1) + "õ " + num1.charAt(2) + "�� " + num1.charAt(3) + "�� " 
					 + num1.charAt(4) + "����";
		} else if ( len > 9 ) {
			result = num1.substring(0,2) + "�� " + num1.charAt(2) + "õ " + num1.charAt(3) + "�� " + num1.charAt(4) + "�� " 
					 + num1.charAt(5) + "����";
		}
		return result;
	} 
	
}