package submit;

public class Submit01 {

	public static void main(String[] args) {
		int i = 23;
		double x = 24.2;
		String y = "32";
		
		System.out.println((double)i); // 정수 >> 실수 
		
		System.out.println((int)x);   // 실수 >> 정수  
		
		String i1 = Integer.toString(i);            //정수 타입 > 문자열로 
		
		System.out.println(i1);
		
//		System.out.println(i1 + 34);
		
		int x1 = Integer.parseInt(i1);  // 문자열 > 정수
		
//		System.out.println(x1 + 9898);
		
		
		final int I = 99;             //상수 선언 
		final double X = 99.99;
		final String Y = "구구";
		
		System.out.println("상수 int " + I);
		System.out.println("상수 double "+X);
		System.out.println("상수 String " + Y);
		
		
	}

}