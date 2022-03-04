package org.daily_review;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class CollectionMap {

	public static void main(String[] args) {
		// HashMap의 선언 
		// 중복X 
		// ArrayList와 달리 순서대로 나오지 않음 
		
		
		// Key 컬레션 내의 키중 유일해야함 
		// value 키와 달리 데이터의 중복 허용 
		
		HashMap<String, String> famMap = new HashMap<String, String>();
		
//		HashMap.add("첫째", "나");  hashmap은 .add가 아니라 .put
		famMap.put("첫째", "나");
		famMap.put("둘째", "동생");
		famMap.put("셋째", "없음");
		famMap.put("넷째", "없다");
		System.out.println(famMap);
		
		famMap.put("둘째", "바보같음");
		System.out.println(famMap);
		
		HashMap<Double, String> version = new HashMap<>();
		version.put(1.0, "구버전");
		version.put(2.0, "구버전");
		version.put(3.0, "신버전");
		
		System.out.println(version);
		
		System.out.println(version.size()); // 담긴 사이즈 리턴 
		
		System.out.println(version.containsKey(3.0));  // 3.0이라는 키 값이 있어서 true 리턴 
		
		System.out.println(version.get(3.0));  // 키3.0에 해당하는 value 리턴 = 신버전
		
		
		//HashMap 안의 내용을 꺼내는 대표적 3가지 방법 
		
		
		// 1.keySet을 이용한 for문 
		Set<String> keySet = famMap.keySet();
		
		for(String key : famMap.keySet()) {
			System.out.println(famMap.get(keySet)); // 왜 null값만 4개 나오는지 모르겠다 
		}
		
		for(String key : famMap.keySet()) {
			System.out.println(String.format("키 : %s, 값 : %s",key, famMap.get(key))); // 제대로 출력됨 
		}
		
		System.out.println("\n");
		// 2.entrySet을 이용한 for문 
	    // HashMap에 저장된 Key -Value 값을 엔트리(키와 값을 결합)의 형태로 Set에 저장하여 반환 
		Set<Entry<String, String>> entrySet = famMap.entrySet();
		
		for(Entry<String, String> entry : entrySet){
			System.out.printf("키 = %s, 값 = %s", entry.getKey(),entry.getValue());
		}
			System.out.println("\n");
		// 3.Iterator를 이용한 while문 	
			
		Iterator<String>keys= famMap.keySet().iterator();
		
		while(keys.hasNext()) {
			String key = keys.next();
			System.out.println(String.format("키: %s , 값: %s ", key, famMap.get(key))); 
		}
		
		
		
		
		
		
		
		
		
		
		
		
		}
		
		
		

}	


