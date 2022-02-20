package quesition;

public class salary {

	public static void main(String[] args) {
		//기본급이 1,500,000원, 수당이 55,000원 세은 기본급의 10%
		//실수령액 = 기본급 + 시간수당 - 세금
		
		int basic = 1500000;
		int add = 55000;
		int tax = (1500000 / 10);
		int total = basic + add - tax;
		
		System.out.println("실수령액 = " + total);
	}

}
