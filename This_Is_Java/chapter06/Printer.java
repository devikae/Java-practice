package chapter06;

public class Printer {
	String text ="";
	int num;
	boolean tf ;
	double dnum;
	
	static void printer() {
		
	}
	
	public static int println(int num) {
		System.out.println(num);
		return num;
	}
	
	public static String println(String text) {
		System.out.println(text);
		return text;
	}

	public static boolean println(boolean tf) {
		System.out.println(tf);
		return tf;
	}

	public static double println(double dnum) {
		System.out.println(dnum);
		return dnum;
	}

}
