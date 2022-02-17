package org.opentutorials.javatutorials.loop;

public class LoopDepthDemo {

	public static void main(String[] args) {
		// 반복문의 중첩 
		
		for(int i=0; i<10; i++)       // i의 값이 0~9까지 반복되며 실행
			for(int j=0; j<10; j++)  
				for(int k=0; k<10; k++)
				System.out.println(i + "" + j + ""+ k);

	}
}
