package org.review_for_wrong_answer;

public class Tree {

	public static void main(String[] args) {
		

		String star = "*";
		
		String blank = " ";
		
		
		for(int i = 0; i<5; i++) {
			
			for(int j = 1+i; j<5; j++) {
				
				System.out.print(blank);
			}
			
			for(int k = 0; k<2*i+1; k++) {
				System.out.print(star);
			}
			
			
			System.out.println();
		}
		
		
		
		for(int i =5; i>0; i--) {
			
			for(int j = 5; j>i; j--) {
				System.out.print(blank);
			}
			
			for(int k = 0; k<i*2-1; k++)
			{
				System.out.print(star);
			}
			System.out.println();
		}
		
		
		
		
		
		

	}

}
