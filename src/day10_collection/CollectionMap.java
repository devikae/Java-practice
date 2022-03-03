package day10_collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class CollectionMap {

	public static void main(String[] args) {
		// HashMap의 선언  
		// key와 value를 담음
		
		
		HashMap<String,String> stuMap = new HashMap<String,String>();
		HashMap<String, Integer> stuMap2 = new HashMap<>();            	// 뒤에 < > 제너릭 생략 가능
		Map<Integer, String> stuMap3 = new HashMap<Integer, String>(); 	// hashSet과 같이 다형성 ㄱㄴ 
		
		
		// .put(Key, Value)  맵에 데이터 추가        .add아님 
		//        키와,   값 
		
		stuMap.put("첫째", "손오공");	
		stuMap.put("둘째", "손오반");	
		stuMap.put("셋째", "손오천");
		System.out.println(stuMap);
		
		stuMap.put("첫째", "배지터");         // 값 변경 ㄱㄴ 
		System.out.println(stuMap);
		
		
		stuMap2.put("비트코인", 4000);
		stuMap2.put("삼성전자", 6);
		System.out.println(stuMap2);
		
		stuMap3.put(0, "민우");
		stuMap3.put(32123, "유진");
		System.out.println(stuMap3);
		
		System.out.println("===========================================================");
		
		// .size() 
		
		System.out.println(stuMap.size());
		
		// .containsKey()
		// 해당 맵에 키가 존재한다면 true 리턴 / 없으면 false
		System.out.println(stuMap.containsKey("둘째"));
		
		// .containsValue()
		// 해당 맵에 값이 존재한다면 true리턴  / 없으면 false 
		
		System.out.println(stuMap.containsKey("손오공"));           //위에서 배지터로 바꿔서 false 
		
		// .get(Key)
		// key에 해당하는 Value를 리턴 
		
		System.out.println(stuMap.get("비트코인"));
		
		// .remove(key) 
		// Key에 해당하는 데이터를 삭제 (해당 키 까지 삭제 )
		
		stuMap.remove("첫째");
		System.out.println(stuMap);                      // set처럼 순서를 보장하지 않음 순서가 필요하다면 ArrayList사용   
		
		System.out.println("=================================================================================");
		
		// Map 순회 방법 
		
		
		// 1. KeySet 이용
		Set<String> keySet = stuMap.keySet();
		
		//Set으로 만든 뒤 향상된 for문 이용 
		for(String key : keySet) {
			System.out.println(stuMap.get(key));
		}
		
		// 2. EntrySet 이용 
		Set<Entry <String, String> > entrySet = stuMap.entrySet();
		
		// entry사용 후 
		
		for(Entry<String, String>  entry : entrySet) {
			String key = entry.getKey();
			String value = entry.getValue();
			System.out.println(key + "=" + value);
			
		}
		
		// for-Each + 람다식 
		stuMap.forEach((key, value) -> {
											System.out.println(key + value);
		});
		
		
		
		

	}

}
