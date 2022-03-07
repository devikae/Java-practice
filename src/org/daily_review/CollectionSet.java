package org.daily_review;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class CollectionSet {

	public static void main(String[] args) {
//		HashSet 
//		특징: 인덱스 없음(순서가 없음), 중복을 허용하지 않음 
		
		HashSet<String> brendSet = new HashSet<String>();
		
		brendSet.add("LG");
		brendSet.add("SAMSUNG");
		brendSet.add("APPLE");
		System.out.println(brendSet);  
		
//		Set 순회 
		
		Iterator<String> iterator = brendSet.iterator();
		
		
//		while 
		while(iterator.hasNext()) {
			String name = iterator.next();
			System.out.println(name);
		}System.out.println("======");

		
		
		//중복된 값이 담기지 않는걸 이용해 중복 제거 
		ArrayList<Integer> intList = new ArrayList<Integer>();
		
		for(int i = 0; i< 10; i++) {     //intList에 0~9까지 값이 담김 
			intList.add(i);
		}
		
		for(int i = 4; i<10; i++) {      // intList에 4~9까지 값이 담김 
			intList.add(i);
		}
		
		System.out.println(intList);      
		
		HashSet<Integer> tempSet = new HashSet<Integer>(intList); //tempSet에 intList값을 저장
		
		System.out.println(tempSet);  // tempSet 출력 > 중복값 사라짐 
		
		
		//HashSet을 다시 ArrayList로 변환 
		intList.clear();
		
		intList.addAll(tempSet); 
		System.out.println(intList);      // 재선언 후 tempSet의 값을 intList에 저장 
		
	}

}
