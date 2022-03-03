package day10_collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class CollectionSet {

	public static void main(String[] args) {
		// 집합(HashSet)의 선언 
		// 특징 1. 인덱스가 없다.
		// 특징 2. 집합을 쓰는 경우가 아니라면 잘 쓰이지 않는다.
		// 특징 3. 그나마 사용한다면 중복을 허용하지 않는 속성을 이용할 경우 사용.
		
		
		HashSet<String> stuSet = new HashSet<String>(); 
		HashSet<String> stuSet2 = new HashSet<>();  // 앞에서 타입을 선언 하면 뒤에서 안써도 되지만 명시적으로 써두는게 좋다 
		
		Set<String> stuSet3 = new HashSet<String>(); // 다형성 
		
		// .add() 데이터 담기 
		stuSet.add("욱근");
		stuSet.add("주석");
		stuSet.add("예반");
		System.out.println(stuSet);

		
		
		stuSet.add("욱근");  // 중복된 값 담기지 않음.    
		System.out.println(stuSet);
		
		// .contains() 해당 데이터가 Set 안에 있으면 true 없으면 false
		System.out.println(stuSet.contains("주석"));   
		
		// .size() Set안에 있는 데이터의 개수 리턴 
		System.out.println(stuSet.size());
		
		
		System.out.println("================================================================================================");
		
		// Set의 순회? 조회?
		// while문 사용 
		
		Iterator<String> iterator = stuSet.iterator();
		// 타입 맞춰줘야함 
		
		while(iterator.hasNext()) {
			String name = iterator.next();
			System.out.println(name);
		}
		
		for(int i = 0; i<100; i++) {
			stuSet.add(i + "");
		}
		
		// 향상된 for문 = for-each문
		for(String name : stuSet) {
			if(name.length() ==1) {
				System.out.println(name);
			}
		}
		
		// .foreach 사용 
		stuSet.forEach(name -> System.out.println(name));
		stuSet.forEach(name -> {
									System.out.println(name);
		});
		
		
		ArrayList<Integer> intList = new ArrayList<Integer>();
		
		for(int i = 0; i < 10; i++) {
			intList.add(i);  
		}
		
		for(int i = 4; i < 10; i++) {
			intList.add(i);
		}
		
		System.out.println(intList); // 중복된 값이 담김 
		
		//중복 제거를 위해 Set를 이용 
		
		//ArrayList에서 HashSet으로 변환 
		HashSet<Integer> tempSet = new HashSet<Integer>();
		
		tempSet.addAll(intList);  // intList의 값이 전부 tempSet에 들어간다 
		
		System.out.println(tempSet);  // 중복된 값 모두 사라짐 
		
		
		
		//HashSet을 다시 ArrayList로 변환 
		intList.clear(); 						 // 클리어로 비워주거나 
		intList = new ArrayList<Integer>(); // 재선언 하거나 해서 비워준다 
	
		intList.addAll(tempSet);
		System.out.println(intList);
		
		
		
		
		

	}

}
