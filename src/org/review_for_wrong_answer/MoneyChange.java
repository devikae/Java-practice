package quesition;

public class MoneyChange {

	public static void main(String[] args) {
      //65430원을 만들기 위한 화폐의 갯수는?
		
	 String money = "65430원";
	 	 
	 for(int i = 0; i < 4; i++) {
		 String m = money.substring(i, i+1);
		 int o = Integer.parseInt(m);
	 if (o == 6) {
		 System.out.println("만원 = " + o );	 
	 }else if(o == 5) {
		 System.out.println("천원 = " + o );
	 }else if(o == 4) {
		 System.out.println("백원 = " + o );
	}else {
		System.out.println("십원 = " + o );
	}

	}
}
	}