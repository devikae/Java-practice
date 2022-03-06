package study;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class Lotto {

	public static void main(String[] args) {
		
		//HashSet을 이용해 로또번호의 값을 중복되지 않게 담아보자
		ArrayList<Integer> lottoNum = new ArrayList<Integer>();
		
		HashSet<Integer> lotNum = new HashSet<Integer>();
		
		for(int i = 0; i<7; i++) {
			int lotto = (int) (Math.random() * 45 +1);
			
			lotNum.add(lotto);
			
			if(lotNum.size() == 7) {
				break;
			}
		}
		lottoNum.addAll(lotNum);
		Collections.sort(lottoNum);
		System.out.println(lottoNum);
		
		ArrayList<Integer> intList = new ArrayList<Integer>();
		
		for (int i = 0; i<10; i++) {
			intList.add(i);
		}
		for (int i = 4; i<10; i++) {
			intList.add(i);
		}
		ArrayList<Integer> intArray = new ArrayList<Integer>();		
		for (int i = 0; i < intList.size(); i++) {
			
			if(intArray.indexOf(intList.get(i)) == -1) {
				intArray.add(intList.get(i));
			}
		}System.out.println(intArray);
		
		
		
		
		
		
		
	}	
		

}
