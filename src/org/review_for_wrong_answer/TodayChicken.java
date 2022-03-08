package org.review_for_wrong_answer;

public class TodayChicken {

	public static void main(String[] args) {
		int ck =(int) (Math.random() * 49 +1); 
		
		if (ck <= 10){
		 System.out.println("±³ÃÌ" );
		
		}else if(ck <=20) {
			System.out.println("bhc" );
		 
		}else if(ck <=30) {
		 System.out.println("BBQ" );
	    
		}else if(ck <=40) {
			 System.out.println("Çª¶ó´ß" );
	    
		}else {
			System.out.println("ÁöÄÚ¹Ù" );
		}
	
	
	
	}

}
