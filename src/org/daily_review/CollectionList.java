package org.daily_review;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.function.Consumer;

public class CollectionList {

	public static void main(String[] args) {
		//오늘 배운 collection List의 복습 
		
		//ArrayList의 선언방법 
		//< >제네릭 안에 타입 선언  
		
		ArrayList<String> brendList = new ArrayList<String>();
		
		ArrayList <Integer> intList = new ArrayList<Integer>();
		
		//ArrayList에 데이터 담는 방법은 뭐였을까?  .add()
		
		brendList.add("나이키");
		brendList.add("아디다스");
		brendList.add("마르지엘라");
		brendList.add("프라다");
		
		
		intList.add(12);
		intList.add(13);
		intList.add(14);
		
		System.out.println(brendList);

		System.out.println(intList);
		
		// .get() 인덱스 번호를 통해 하나씩 출력 가능 
		
		System.out.println(brendList.get(0));
		System.out.println(intList.get(0));
		
		// .size() 배열의 크기를 알 수있음 
		
		System.out.println("brendList의 크기 : " + brendList.size());
		System.out.println("intList의 크기 : " + intList.size());
		
		brendList.add(3, "마틴로즈");
		
		// .get("값", 인덱스넘버) 인덱스 넘버 자리에 데이터 끼워넣기 가능 기존 데이터 뒤로 밀림 
		System.out.println(brendList);
		
		
		// .isEmpty boolean값으로 출력 비어있지 않기때문에 false
		System.out.println(brendList.isEmpty());
		
		// .remove() 해당 인덱스의 저장된 데이터 삭제
		brendList.remove(0);
		System.out.println(brendList);
		
		//리스트 복사 방법 
		
		//방법.1
		ArrayList<String> copyList = new ArrayList<String>();
		copyList.addAll(brendList);
		System.out.println(copyList);
		
		//방법2
		ArrayList<Integer> copyint = new ArrayList<Integer>(intList);
		System.out.println(copyint);  
		
		int idx=0;
		copyList.clear();
		
		for(String name : brendList) {
			if(idx %2 == 0) {          // for문을 이용해 인덱스 짝수자리의 데이터값만 담음
				copyList.add(name);
			}
			idx++;
		}
		System.out.println(copyList);
		
		
		//값을 주면서 선언 
		
		ArrayList<String> NewList = new ArrayList<String>(Arrays.asList("c", "d", "a")); 
		
		
		//오름차순 정렬
		Collections.sort(NewList);
		
		
		System.out.println(NewList);
		
		
		
		

	}

}
