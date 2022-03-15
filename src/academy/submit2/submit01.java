package submit2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class submit01 {
	public static void main(String[] args) {
		
		// 정수를 담을 수 있는 ArrayList 객체를 생성하고, 10부터 20사이의 랜덤숫자 10개를 담으시\
		ArrayList<Integer> intList = new ArrayList<Integer>();
		
		for (int i = 0; i < 10; i++) {
			int x = (int)(Math.random() * 11) + 10;
			intList.add(x);
			
			// 해당 정수열 리스트를 한 줄로 출력하시오.
		}System.out.println(intList);
		
		// 해당 정수형 리스트에서 중복된 숫자들을 제거한 후 출력하시오
		
		ArrayList<Integer> intList2 = new ArrayList<Integer>();
		
		for (int i =0; i< 10; i++) {
			int x =(int) (Math.random() * 20) +1;
			intList2.add(x);
		}
		HashSet<Integer> intHash = new HashSet<Integer>(intList2);
		System.out.println(intHash);
		
		ArrayList<Integer> sortList = new ArrayList<Integer>(intHash);
		
		Collections.sort(sortList);
		System.out.println(sortList);
		
		Collections.reverse(sortList);
		System.out.println(sortList);
		
		
		
	}
}